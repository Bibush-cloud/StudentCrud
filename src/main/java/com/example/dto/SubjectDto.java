package com.example.dto;

import lombok.Builder;

public record SubjectDto(
        String subjectId,
        String subjectName,
        int marks,
        String studentId
) {
    @Builder(toBuilder = true)
    public SubjectDto{

    }
}
