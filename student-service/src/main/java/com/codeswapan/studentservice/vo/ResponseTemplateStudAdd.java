package com.codeswapan.studentservice.vo;

import com.codeswapan.studentservice.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateStudAdd {
    private Address address;
    private Student student;
}
