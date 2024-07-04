package org.example.springmybatis.controller;

import org.example.springmybatis.domain.Students;
import org.example.springmybatis.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/count")
    public int countStudents() {
        return studentService.countStudent();
    }

    // students DB 정보 출력     /students?id=1
    @GetMapping("/students")
    public List<Students> getStudents(@RequestParam(required = false) Long id) {
        return studentService.getStudents(id);
    }

    // POST {"name" : "이름", "age" : 20, "address" : "서울시"}
    @PostMapping("/students")
    // json 형태로 http post 요청이 들어왔을 때 받을 수 있는 객체
    public String addStudent(@RequestBody Students students){
        studentService.saveStudent(students);
        return "OK";
    }
}
