package com.anuradha.modelmapper.service;

import com.anuradha.modelmapper.dto.StudentDto;
import com.anuradha.modelmapper.entity.Student;
import com.anuradha.modelmapper.repo.StudentRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public StudentDto save(StudentDto studentDto) {
        Student student = modelMapper.map(studentDto, Student.class);
        studentRepository.save(student);
        return modelMapper.map(student, StudentDto.class);
    }
}
