package com.codeswapan.studentservice.service;

import com.codeswapan.studentservice.entity.Student;
import com.codeswapan.studentservice.repository.StudentRepository;
import com.codeswapan.studentservice.vo.Address;
import com.codeswapan.studentservice.vo.ResponseTemplateStudAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public ResponseTemplateStudAdd getStudentById(Long studentId) {
        Student student=studentRepository.findAllByStudentId(studentId);
        Address address=restTemplate.getForObject("http://ADDRESS-SERVICE/addresses/getAddressById/"+student.getAddressId(),Address.class);
        ResponseTemplateStudAdd responseTemplate=new ResponseTemplateStudAdd();
        responseTemplate.setAddress(address);
        responseTemplate.setStudent(student);
        return responseTemplate;
    }
}
