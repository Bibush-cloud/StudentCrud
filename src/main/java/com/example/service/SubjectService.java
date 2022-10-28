package com.example.service;

import com.example.dto.SubjectDto;

import java.util.List;

public interface SubjectService {
    SubjectDto addSubject(SubjectDto subjectDto);

    List<SubjectDto> findAllSubject();

   List <SubjectDto> findBySubjectId(String studentId);
}
