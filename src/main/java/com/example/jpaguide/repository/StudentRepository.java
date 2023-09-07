package com.example.jpaguide.repository;

import com.example.jpaguide.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}