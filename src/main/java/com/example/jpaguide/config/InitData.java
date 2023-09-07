package com.example.jpaguide.config;

import com.example.jpaguide.model.Student;
import com.example.jpaguide.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
    public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setBornDate(LocalDate.now());
        student.setBornTime(LocalTime.now());
        student.setName("Jens");
        studentRepository.save(student);
        studentRepository.save(student);
        studentRepository.save(student);
    }

}
