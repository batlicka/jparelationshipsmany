package com.example.jparelationshipsmanytox.subject;

import com.example.jparelationshipsmanytox.student.Student;
import com.example.jparelationshipsmanytox.student.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnrollStudentServiceImpl implements EnrollStudentService{
    private final SubjectRepository subjectRepository;

    private final StudentRepository studentRepository;


    public EnrollStudentServiceImpl(SubjectRepository subjectRepository, StudentRepository studentRepository) {
        this.subjectRepository = subjectRepository;
        this.studentRepository = studentRepository;
    }

    @Transactional
    @Override
    public void enrollStudentsById(Long subjectId, Long studentId) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Student student = studentRepository.findById(studentId).get();
        subject.enrollStudents(student);
        subjectRepository.save(subject);
    }
}
