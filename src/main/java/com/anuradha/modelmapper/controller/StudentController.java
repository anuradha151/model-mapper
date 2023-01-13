package com.anuradha.modelmapper.controller;

import com.anuradha.modelmapper.dto.StudentDto;
import com.anuradha.modelmapper.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentDto save(@RequestBody StudentDto request) {
        return studentService.save(request);
    }
}
