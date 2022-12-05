package com.example.jparelationshipsmanytox.services;

import com.example.jparelationshipsmanytox.student.Student;
import com.example.jparelationshipsmanytox.student.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    public Student saveNewStudent(String name){
        return studentRepository.save(new Student(null,name,new HashSet<>()));
    }
}
