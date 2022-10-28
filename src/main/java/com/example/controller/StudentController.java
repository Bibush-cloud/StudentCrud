package com.example.controller;

import com.example.dto.StudentDto;
import com.example.service.StudentService;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller
public class StudentController {

    @Inject
    StudentService studentService;

    @Post("/create")
    public StudentDto createStudent(@Body StudentDto body) {
        var data = studentService.addStudent(body);
        return data;
    }

    @Get("/{id}")
    public StudentDto findById(@PathVariable String id) {
        return studentService.findById(id);
    }

    @Get("/list/getAllStudent")
    public List<StudentDto> findAll(){
        return studentService.findAllStudent();
    }

    @Delete("/{id}")
    public void deleteById(@PathVariable String id){
        studentService.deleteById(id);
    }


}
