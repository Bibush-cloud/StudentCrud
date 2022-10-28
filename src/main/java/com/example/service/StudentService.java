package com.example.service;

import com.example.dto.StudentDto;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface StudentService {

    StudentDto addStudent(StudentDto studentDto);

    StudentDto findById(String id);

   List<StudentDto> findAllStudent();

   void deleteById(@NotNull String id);

//   StudentDto findByStudentId(String studentId);
}

