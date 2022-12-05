package com.example.jparelationshipsmanytox.student;

import com.example.jparelationshipsmanytox.subject.Subject;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Student {
    @Id
    @GeneratedValue(generator = "student_idx")
    @SequenceGenerator(name= "student_idx", sequenceName = "student_idx")
    @Column(name = "ID", nullable = false, precision = 0)
    Long id;
    @Column(name = "NAME", nullable = true, length = 15)
    private String name;
    @JsonIgnore
    @ManyToMany(mappedBy = "enrolledStudents")
    private Set<Subject> subjects = new HashSet<>();
    public Long getId() {
        return id;
    }

    public Student() {
    }

    public Student(Long id, String name, Set<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }
}
