package com.capgemini.serialization.many_to_many.execution;

import java.util.Arrays;
import java.util.List;

import com.capgemini.serialization.entity.Project;
import com.capgemini.serialization.entity.Student;
import com.capgemini.serialization.filehandler.FileHandler;

public class JavaApp4 {

	public static void execution() {
		try {
			FileHandler fh = new FileHandler();

			fh.createFile();

			Student s1 = new Student(1, "Raja", "r@gmail.com", 1111111111L);
			Student s2 = new Student(2, "Aman", "a@gmail.com", 2222222222L);

			List<Student> students = Arrays.asList(s1, s2);

			Project p = new Project(1, "Java", students);

			fh.write(p);
			fh.read(Project.class);

			fh.deleteTheFile();

			System.out.println("Hello World!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}