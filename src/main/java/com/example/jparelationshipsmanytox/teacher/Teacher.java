package com.example.jparelationshipsmanytox.teacher;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(generator = "teacher_idx")
    @SequenceGenerator(name= "teacher_idx", sequenceName = "teacher_idx")
    @Column(name = "ID", nullable = false, precision = 0)
    private Long id;
    @Column(name = "NAME", nullable = true, length = 15)
    private String name;
}
