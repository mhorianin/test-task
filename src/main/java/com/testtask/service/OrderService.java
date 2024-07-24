package com.testtask.service;

import com.testtask.dto.OrderRequestDto;
import com.testtask.dto.OrderResponseDto;
import java.util.List;

public interface OrderService {
    OrderResponseDto create(OrderRequestDto requestDto);

    List<OrderResponseDto> getAll();

}
