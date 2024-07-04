package org.example.springdatajpaexample.service;

import org.example.springdatajpaexample.domain.Students;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// today
@SpringBootTest
class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void insertTest() {
        studentService.insertStudent(new Students("김길동", 35, "강원도"));
    }
}