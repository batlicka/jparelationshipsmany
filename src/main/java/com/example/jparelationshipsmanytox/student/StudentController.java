package com.example.jparelationshipsmanytox.student;

import com.example.jparelationshipsmanytox.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentService studentService;

    @GetMapping()
    List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/createS/{name}")
    String createStudent2(@PathVariable String name){
       Student newStudent = studentService.saveNewStudent(name);
       return "new student: " + newStudent.getName() + "saved";
    }


    @PostMapping
    Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/test")
            String testMapping(){
                return "this is test string";
            }
}
