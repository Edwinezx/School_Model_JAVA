package com.school.model.people;

public abstract class People {
    protected String name;
    protected int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}


