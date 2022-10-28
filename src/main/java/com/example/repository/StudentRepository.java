package com.example.repository;

import com.example.entity.Student;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface StudentRepository extends PageableRepository<Student, String> {


}
