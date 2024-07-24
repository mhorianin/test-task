package com.testtask.controller;

import com.testtask.dto.OrderRequestDto;
import com.testtask.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/test/private")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/getOrders")
    public String getOrders(Model model) {
        model.addAttribute("orders", orderService.getAll());
        return "get-orders";
    }

    @PostMapping("/createOrder")
    public String createOrder(@RequestParam("lastname") String lastname,
                              @RequestParam("product") String product,
                              @RequestParam("quantity") int quantity,
                              Model model) {
        try {
            OrderRequestDto requestDto = new OrderRequestDto(lastname, product, quantity);
            orderService.create(requestDto);
            model.addAttribute("message", "Order added successfully!");
        } catch (Exception e) {
            model.addAttribute("message", "Error adding order: " + e.getMessage());
        }
        return "add-order";
    }
}
