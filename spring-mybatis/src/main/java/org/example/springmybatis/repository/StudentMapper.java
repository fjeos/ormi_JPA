package org.example.springmybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.springmybatis.domain.Students;

import java.util.List;

@Mapper
public interface StudentMapper {
    int countStudents();

    List<Students> findStudents(@Param("id") Long id);

    void saveStudent(Students students);
}
