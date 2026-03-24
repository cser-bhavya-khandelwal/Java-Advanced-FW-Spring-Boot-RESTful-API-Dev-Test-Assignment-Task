package com.capgemini.serialization.entity;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {

    private Integer id;
    private String name;
    private String mailId;
    private long contactNumber;

    // ===== RELATIONSHIPS =====

    // One-to-One
    private Project project;

    // One-to-Many
    private List<Project> projects;

    public Student() {}

    // BASIC
    public Student(Integer id, String name, String mailId, long contactNumber) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
    }

    // One-to-One
    public Student(Integer id, String name, String mailId, long contactNumber, Project project) {
        this(id, name, mailId, contactNumber);
        this.project = project;
    }

    // One-to-Many
    public Student(Integer id, String name, String mailId, long contactNumber, List<Project> projects) {
        this(id, name, mailId, contactNumber);
        this.projects = projects;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getMailId() { return mailId; }
    public long getContactNumber() { return contactNumber; }
    public Project getProject() { return project; }
    public List<Project> getProjects() { return projects; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name=" + name +
                ", mailId=" + mailId + ", contact=" + contactNumber +
                (project != null ? ", " + project : "") +
                (projects != null ? ", " + projects : "") +
                "}";
    }
}