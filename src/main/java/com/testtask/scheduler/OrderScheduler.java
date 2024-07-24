package com.testtask.scheduler;

import com.testtask.model.Order;
import com.testtask.repository.OrderRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderScheduler {
    private static final Logger logger = LoggerFactory.getLogger(OrderScheduler.class);
    private final OrderRepository orderRepository;

    @Scheduled(cron = "0 0/5 * * * *")
    public void processNewOrders() {
        List<Order> orders = orderRepository.findAll().stream()
                .filter(order -> order.getStatus().equals(Order.Status.NEW))
                .toList();
        for (Order order : orders) {
            logger.info("It is being processed now: {}", order);
            order.setStatus(Order.Status.COMPLETED);
            orderRepository.save(order);
        }
    }
}
