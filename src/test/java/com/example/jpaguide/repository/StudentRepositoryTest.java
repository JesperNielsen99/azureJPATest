package com.example.jpaguide.repository;

import com.example.jpaguide.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        Student std = new Student();
        std.setName("test");
        studentRepository.save(std);
    }

    @Test
    void TestOneStudent() {
        List<Student> students = studentRepository.findAll();
        assertEquals(students.size(), 1);
    }
}