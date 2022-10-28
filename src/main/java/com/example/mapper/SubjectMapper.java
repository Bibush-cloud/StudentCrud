package com.example.mapper;

import com.example.dto.SubjectDto;
import com.example.entity.Subject;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;

@Builder
public class SubjectMapper {
    public static Subject toEntity(SubjectDto subjectDto) {
        return Subject.builder()
                .subjectName(subjectDto.subjectName())
                .marks(subjectDto.marks())
                .studentId(subjectDto.studentId())
                .build();
    }

    public static SubjectDto toDto(Subject subject) {
        return SubjectDto.builder()
                .subjectId(subject.getId())
                .subjectName(subject.getSubjectName())
                .marks(subject.getMarks())
                .build();
    }

    public static List<SubjectDto> toDoList(List<Subject> subjects) {
        return subjects.stream().map(data -> toDto(data)).collect(Collectors.toList());
    }
}
