package com.capgemini.model.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String mailId;
    private Long contactNumber;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private List<Project> projects;

    public Student() {}

    public Student(Integer id, String name, String mailId, Long contactNumber, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
        this.projects = projects;
    }

    // getters setters
}