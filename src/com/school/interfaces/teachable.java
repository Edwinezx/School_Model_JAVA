package com.school.interfaces;

import com.school.model.course.Course;

//interface for individuals that can teach courses
public interface teachable {
        void teachCourse(Course course);
        boolean isAvailable();
    }

