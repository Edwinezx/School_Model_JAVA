package com.school.model.people.staff.academic;

import com.school.interfaces.teachable;
import com.school.model.course.Course;
import com.school.model.people.People;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends People implements teachable {

    private List<Course> courses = new ArrayList<>();
    private static final int MAX_COURSES = 3;

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teachCourse(Course course) {
        if (isAvailable()) {
            if (!courses.contains(course)) {
                courses.add(course);
                System.out.println(getName() + " is now teaching " + course.getCourseName());
            }
        } else {
            System.out.println(getName() + " cannot teach more courses.");
        }
    }

    @Override
    public boolean isAvailable() {
        return courses.size() < MAX_COURSES;
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses); // defensive copy
    }
}
