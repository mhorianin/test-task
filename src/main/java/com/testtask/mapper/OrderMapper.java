package com.testtask.mapper;

import com.testtask.config.MapperConfig;
import com.testtask.dto.OrderRequestDto;
import com.testtask.dto.OrderResponseDto;
import com.testtask.model.Order;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface OrderMapper {
    OrderResponseDto toDto(Order order);

    Order toModel(OrderRequestDto requestDto);
}
