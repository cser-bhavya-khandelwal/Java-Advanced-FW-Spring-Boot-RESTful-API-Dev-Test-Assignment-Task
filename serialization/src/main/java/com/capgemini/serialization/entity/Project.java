package com.capgemini.serialization.entity;

import java.io.Serializable;
import java.util.List;

public class Project implements Serializable {
    private int projectId;
    private String projectName;

    // for Many-to-Many
    private List<Student> students;

    public Project() {}

    public Project(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public Project(int projectId, String projectName, List<Student> students) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.students = students;
    }

    public int getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Project{id=" + projectId + ", name=" + projectName + "}";
    }
}