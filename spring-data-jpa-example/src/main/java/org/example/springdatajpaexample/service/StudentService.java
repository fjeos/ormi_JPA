package org.example.springdatajpaexample.service;

import org.example.springdatajpaexample.domain.Students;
import org.example.springdatajpaexample.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> selectAllStudents() {
        return studentRepository.findAll();
    }

    // today
    public Students insertStudent(Students student) {
        return studentRepository.save(student);
    }
}
