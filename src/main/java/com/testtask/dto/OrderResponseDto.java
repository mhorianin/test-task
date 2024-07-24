package com.testtask.dto;

import lombok.Data;

@Data
public class OrderResponseDto {
    private Long id;
    private String lastname;
    private String product;
    private Integer quantity;
}
