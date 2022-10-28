package com.example.mapper;

import com.example.dto.StudentDto;
import com.example.entity.Student;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

@NoArgsConstructor
@Builder(toBuilder = true)
public class StudentMapper {

    //changing dto type to entity.
    public static Student toEntity(StudentDto studentDto) {
        return Student.builder()
                .id(Optional.ofNullable(studentDto.id()).orElse(UUID.randomUUID().toString()))
                .firstName(studentDto.firstName())
                .lastName(studentDto.lastName())
                .build();
    }

    //changing to student entity type to dto
    public static StudentDto toDto(Student student) {
        return StudentDto.builder()
                .id(student.getId())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .build();
    }

    //List all student entity in dto type
    public static List<StudentDto> toDtoList(List<Student> students) {
//        List<StudentDto> dtoList = new ArrayList<>();
//        students.forEach(student -> dtoList.add(toDto(student)));

        return  students.stream().map(data-> toDto(data)).collect(Collectors.toList());
    }
}
