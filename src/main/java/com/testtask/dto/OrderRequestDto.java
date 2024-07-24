package com.testtask.dto;

public record OrderRequestDto(
        String userSurname,
        String name,
        int quantity
) {
}
