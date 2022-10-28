package com.example.repository;

import com.example.entity.Subject;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

import java.util.List;

@Repository
public interface SubjectRepository extends PageableRepository<Subject, String > {

    List<Subject> findByStudentId(String studentid);

}
