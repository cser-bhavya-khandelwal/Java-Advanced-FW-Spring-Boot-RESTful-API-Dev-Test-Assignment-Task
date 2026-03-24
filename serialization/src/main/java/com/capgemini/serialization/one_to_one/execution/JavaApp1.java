package com.capgemini.serialization.one_to_one.execution;

import com.capgemini.serialization.entity.Project;
import com.capgemini.serialization.entity.Student;
import com.capgemini.serialization.filehandler.FileHandler;

public class JavaApp1 {

	public static void execution() {
	    try {
	        FileHandler fh = new FileHandler();

	        fh.createFile();

	        Project p = new Project(101, "Java");

	        Student s = new Student(1, "Raja", "raja@gmail.com", 9999999999L, p);

	        fh.write(s);
	        fh.read(Student.class);

	        fh.deleteTheFile();

	        System.out.println("Hello World!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}