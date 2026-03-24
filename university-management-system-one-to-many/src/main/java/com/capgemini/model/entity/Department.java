package com.capgemini.model.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String mailId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private List<Student> students;

    public Department() {}

    public Department(Integer id, String name, String mailId, List<Student> students) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.students = students;
    }

    // getters setters
}