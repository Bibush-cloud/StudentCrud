package com.example.serviceImpl;

import com.example.dto.SubjectDto;
import com.example.entity.Student;
import com.example.entity.Subject;
import com.example.mapper.StudentMapper;
import com.example.mapper.SubjectMapper;
import com.example.repository.SubjectRepository;
import com.example.service.SubjectService;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

public class SubjectServiceImpl implements SubjectService {

    @Inject
    SubjectRepository subjectRepository;

    @Override
    public SubjectDto addSubject(SubjectDto subjectDto) {
        Subject dataEntity = SubjectMapper.toEntity(subjectDto);
        return SubjectMapper.toDto(subjectRepository.save(dataEntity));
    }

    @Override
    public List<SubjectDto> findAllSubject() {
        return SubjectMapper.toDoList((List<Subject>) subjectRepository.findAll());
    }

    @Override
    public List<SubjectDto> findBySubjectId(String studentId) {
        return subjectRepository.findByStudentId(studentId).stream().map(id->SubjectMapper.toDto(id)).collect(Collectors.toList());
    }
}
