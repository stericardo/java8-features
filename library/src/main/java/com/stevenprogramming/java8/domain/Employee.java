package com.stevenprogramming.java8.domain;

public final class Employee {

    private final int id;
    private final String name;
    private final String location;

    public Employee(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
}