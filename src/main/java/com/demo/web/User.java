package com.demo.web;

public class User {

    private final String name;
    private final String role;
    private final int age;

    public User(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }
}
