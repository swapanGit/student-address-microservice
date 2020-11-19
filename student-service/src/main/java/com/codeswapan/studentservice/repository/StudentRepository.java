package com.codeswapan.studentservice.repository;

import com.codeswapan.studentservice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findAllByStudentId(Long studentId);
}
