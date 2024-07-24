package com.testtask.controller;

import com.testtask.dto.OrderRequestDto;
import com.testtask.dto.OrderResponseDto;
import com.testtask.service.OrderService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/orders")
    public String getOrders(Model model) {
        List<OrderResponseDto> orders = orderService.getAll();
        model.addAttribute("orders", orders);
        return "get-orders";
    }

    @GetMapping("/order-create")
    public String createOrderForm(OrderRequestDto requestDto) {
        return "add-order";
    }

    @PostMapping("/order-create")
    public String createOrder(OrderRequestDto requestDto) {
        orderService.create(requestDto);
        return "redirect:/orders";
    }
}
