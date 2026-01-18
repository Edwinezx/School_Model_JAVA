package com.school.interfaces;

import com.school.model.course.Course;

//interface for individuals that can take courses
public interface learnable {
    void takeCourse(Course course);
    boolean isAvailable();
}

