package com.demo.web;

public class Course {

    private String name;
    private int semester;
    private int credits;

    // Constructor
    public Course(String name, int semester, int credits) {
        this.name = name;
        this.semester = semester;
        this.credits = credits;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
