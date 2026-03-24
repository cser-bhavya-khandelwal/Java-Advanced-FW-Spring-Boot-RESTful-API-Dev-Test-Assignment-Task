package com.capgemini.serialization.execution;

import com.capgemini.serialization.entity.Student;
import com.capgemini.serialization.filehandler.FileHandler;

public class JavaApp {

	public static void execution() {
	    try {
	        FileHandler fh = new FileHandler();

	        fh.createFile();

	        Student s = new Student(1, "Raja", "raja@gmail.com", 9876543210L);

	        fh.write(s);
	        fh.read(Student.class);

	        fh.deleteTheFile();

	        System.out.println("Hello World!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}