package org.example.springdatajpaexample.controller;

import org.example.springdatajpaexample.domain.Students;
import org.example.springdatajpaexample.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Students> getAllStudents() {
        return studentService.selectAllStudents();
    }
}
