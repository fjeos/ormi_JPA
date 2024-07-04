package org.example.springmybatis.repository;

import org.example.springmybatis.domain.Students;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    private final StudentMapper studentMapper;

    public StudentRepository(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int countStudents() {
        return studentMapper.countStudents();
    }

    public List<Students> findStudents(Long id) {
        return studentMapper.findStudents(id);
    }

    public void saveStudent(Students students) {
        studentMapper.saveStudent(students);
    }
}
