package com.codeswapan.studentservice.controller;

import com.codeswapan.studentservice.entity.Student;
import com.codeswapan.studentservice.service.StudentService;
import com.codeswapan.studentservice.vo.ResponseTemplateStudAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/getStudentById/{id}")
    public ResponseTemplateStudAdd getStudentById(@PathVariable("id") Long studentId){
        return studentService.getStudentById(studentId);
    }
}
