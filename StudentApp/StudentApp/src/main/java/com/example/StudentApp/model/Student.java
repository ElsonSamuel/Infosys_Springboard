package com.example.StudentApp.model;

public class Student {
    private int id;
    private String name;
    private String studentClass;
    private int marks;

    // Constructors
    public Student() {}

    public Student(int id, String name, String studentClass, int marks) {
        this.id = id;
        this.name = name;
        this.studentClass = studentClass;
        this.marks = marks;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
