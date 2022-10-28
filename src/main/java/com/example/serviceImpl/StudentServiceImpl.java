package com.example.serviceImpl;

import com.example.dto.StudentDto;
import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;
import io.micronaut.context.annotation.Primary;
import jakarta.inject.Inject;

import java.util.List;

@Primary
public class StudentServiceImpl implements StudentService {
    @Inject
    StudentRepository studentRepository;

    @Override
    public StudentDto addStudent(StudentDto studentDto) {
        Student dataEntity = StudentMapper.toEntity(studentDto);
        return StudentMapper.toDto(studentRepository.save(dataEntity));
    }

    @Override
    public StudentDto findById(String id) {
        return studentRepository.findById(id)
                .map(StudentMapper::toDto)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public List<StudentDto> findAllStudent() {
        return StudentMapper.toDtoList((List<Student>) studentRepository.findAll());
    }

    @Override
    public void deleteById(String id) {
        studentRepository.deleteById(id);
    }

//    @Override
//    public StudentDto findByStudentId(String studentId) {
//    return StudentMapper.toDto(studentRepository.findById(studentId).get());
//    }
}
