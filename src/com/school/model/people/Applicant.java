package com.school.model.people;

import com.school.interfaces.AgeBasedAdmission;

public class Applicant implements AgeBasedAdmission {

    private String name;
    private int age;

    public Applicant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean meetsAgeRequirement(int minAge, int maxAge) {
        return age >= minAge && age <= maxAge;
    }

    // Convert applicant to student only if admitted
    public Student toStudent() {
        return new Student(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
