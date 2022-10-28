package com.example.controller;

import com.example.dto.StudentDto;
import com.example.dto.SubjectDto;
import com.example.service.StudentService;
import com.example.service.SubjectService;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/test")
public class SubjectController {

    @Inject
    SubjectService subjectService;

    @Post("/addSubject")
    public SubjectDto addSubject(@Body SubjectDto body){
        return subjectService.addSubject(body);
    }

    @Get("/allSubjects/{studentId}")
    public List<SubjectDto> getAllSubjects(@PathVariable String studentId){
        return subjectService.findBySubjectId(studentId);
    }

}
