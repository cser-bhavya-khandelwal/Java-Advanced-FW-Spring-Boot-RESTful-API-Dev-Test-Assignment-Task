package com.capgemini.serialization.one_to_many.execution;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.serialization.entity.Project;
import com.capgemini.serialization.entity.Student;
import com.capgemini.serialization.filehandler.FileHandler;

public class JavaApp2 {

	public static void execution() {
	    try {
	        FileHandler fh = new FileHandler();

	        fh.createFile();

	        List<Project> list = new ArrayList<>();
	        list.add(new Project(101, "Java"));
	        list.add(new Project(102, "Spring"));

	        Student s = new Student(2, "Aman", "aman@gmail.com", 8888888888L, list);

	        fh.write(s);
	        fh.read(Student.class);

	        fh.deleteTheFile();

	        System.out.println("Hello World!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}