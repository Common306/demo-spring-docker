package com.example.demospringdocker.service;

import com.example.demospringdocker.model.Student;
import com.example.demospringdocker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;
    public void create(Student student) {
        repository.save(student);
    }

    public List<Student> findAll() {
        return repository.findAll();
    }
}
