package com.example.StudentApp;

import com.example.StudentApp.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StudentAppApplication.class, args);

		Student s = context.getBean(Student.class);
	}

}
