package com.example.StudentApp.service;

import com.example.StudentApp.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private static final int SIZE = 10; // Array size
    private Student[] students = new Student[SIZE];
    private int count = 0; // Track the number of students

    // Add a new student
    public String addStudent(Student student) {
        if (count < SIZE) {
            students[count++] = student;
            return "Student added successfully!";
        }
        return "Student array is full!";
    }

    // Get all students
    public Student[] getAllStudents() {
        return students;
    }

    // Update a student by ID
    public String updateStudent(int id, Student updatedStudent) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                students[i].setName(updatedStudent.getName());
                students[i].setStudentClass(updatedStudent.getStudentClass());
                students[i].setMarks(updatedStudent.getMarks());
                return "Student updated successfully!";
            }
        }
        return "Student not found!";
    }

    // Delete a student by ID
    public String deleteStudent(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                // Shift remaining students
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--count] = null; // Reduce count and clear last element
                return "Student deleted successfully!";
            }
        }
        return "Student not found!";
    }
}
