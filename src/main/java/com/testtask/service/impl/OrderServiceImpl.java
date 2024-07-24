package com.testtask.service.impl;

import com.testtask.dto.OrderRequestDto;
import com.testtask.dto.OrderResponseDto;
import com.testtask.mapper.OrderMapper;
import com.testtask.model.Order;
import com.testtask.repository.OrderRepository;
import com.testtask.service.OrderService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public List<OrderResponseDto> getAll() {
        return orderRepository.findAll().stream()
                .map(orderMapper::toDto)
                .toList();
    }

    @Override
    public OrderResponseDto create(OrderRequestDto requestDto) {
        Order order = orderMapper.toModel(requestDto);
        order.setStatus(Order.Status.NEW);
        return orderMapper.toDto(orderRepository.save(order));
    }
}
