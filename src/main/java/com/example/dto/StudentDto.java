package com.example.dto;

import lombok.Builder;

public record StudentDto(
        String id,
        String firstName,
        String lastName

) {
    @Builder(toBuilder = true)
    public StudentDto {

    }
}
