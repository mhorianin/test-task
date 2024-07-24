package com.testtask.dto;

public record OrderResponseDto(
        Long id,
        String userSurname,
        String name,
        int quantity
) {
}
