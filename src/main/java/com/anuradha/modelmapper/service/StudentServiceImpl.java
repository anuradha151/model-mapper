package com.anuradha.modelmapper.service;

import com.anuradha.modelmapper.dto.StudentDto;
import com.anuradha.modelmapper.repo.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDto save(StudentDto studentDto) {
        return null;
    }
}
