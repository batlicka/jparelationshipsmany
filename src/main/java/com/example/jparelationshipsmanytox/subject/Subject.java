package com.example.jparelationshipsmanytox.subject;

import com.example.jparelationshipsmanytox.student.Student;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject {
    @Id
    @GeneratedValue(generator = "subject_idx")
    @SequenceGenerator(name= "subject_idx", sequenceName = "subject_idx")
    @Column(name = "ID", nullable = false, precision = 0)
    private Long id;
    @Column(name = "NAME", nullable = true, length = 15)
    private String name;
    @ManyToMany
    @JoinTable(name="student_enrolled", joinColumns = @JoinColumn(name = "subject_id"), inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Set<Student> enrolledStudents = new HashSet<>();


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudents(Student student){
        enrolledStudents.add(student);
    }


}
