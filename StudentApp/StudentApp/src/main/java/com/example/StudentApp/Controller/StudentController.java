package com.example.StudentApp.Controller;

import com.example.StudentApp.model.Student;
import com.example.StudentApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Add a new student
    @PostMapping
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // Get all students
    @GetMapping
    public Student[] getAllStudents() {
        return studentService.getAllStudents();
    }

    // Update a student
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }

    // Delete a student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }
}
