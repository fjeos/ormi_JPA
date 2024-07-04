package org.example.springmybatis.service;

import org.example.springmybatis.domain.Students;
import org.example.springmybatis.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // 쿼리 결과를 반환하는 서비스
    public int countStudent() {
        return studentRepository.countStudents();
    }

    public List<Students> getStudents(Long id) {
        return studentRepository.findStudents(id);
    }

    public void saveStudent(Students students) {
        studentRepository.saveStudent(students);
    }
}
