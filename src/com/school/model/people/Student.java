package com.school.model.people;

import com.school.interfaces.learnable;
import com.school.model.course.Course;

import java.util.ArrayList;
import java.util.List;

public class Student extends People implements learnable {

    private List<Course> courses = new ArrayList<>();
    private static final int MAX_COURSES = 3;

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void takeCourse(Course course) {
        if (isAvailable()) {
            if (!courses.contains(course)) {
                courses.add(course);       // Add course to student
                course.addStudent(this);   // Add student to course
            }
        } else {
            System.out.println("Student cannot take any more courses.");
        }
    }

    @Override
    public boolean isAvailable() {
        return courses.size() < MAX_COURSES;
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses); // defensive copy
    }

    public String getName() {
        return super.getName();
    }
}
