package com.example.jparelationshipsmanytox;

import com.example.jparelationshipsmanytox.services.StudentService;
import com.example.jparelationshipsmanytox.student.Student;
import com.example.jparelationshipsmanytox.student.StudentRepository;
import com.example.jparelationshipsmanytox.subject.EnrollStudentService;
import com.example.jparelationshipsmanytox.subject.Subject;
import com.example.jparelationshipsmanytox.subject.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JparelationshipsmanytoxApplication { //implements CommandLineRunner
	@Autowired
    private EnrollStudentService enrollStudentService;

	public static void main(String[] args) {
		SpringApplication.run(JparelationshipsmanytoxApplication.class, args);

	}

//	@Override
//	public void run(String... args) {
//		//enrollStudentService.enrollStudentsById(1L,4L);
//		String end = "";
//	}

	//konec v case: https://youtu.be/f5bdUjEIbrg?t=712

}
