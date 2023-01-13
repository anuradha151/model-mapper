package com.anuradha.modelmapper.repo;

import com.anuradha.modelmapper.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
