package com.testtask.dto;

import lombok.Data;

@Data
public class OrderRequestDto {
    private String lastname;
    private String product;
    private Integer quantity;
}
