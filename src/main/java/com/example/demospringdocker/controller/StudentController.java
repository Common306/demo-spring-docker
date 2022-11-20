package com.example.demospringdocker.controller;

import com.example.demospringdocker.model.Student;
import com.example.demospringdocker.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/hello")
    public String hello() {
        return "hello new student fake real";
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        List<Student> students = service.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("")
    public String create(@RequestBody Student student) {
        service.create(student);
        return "Insert successfully";
    }
}
