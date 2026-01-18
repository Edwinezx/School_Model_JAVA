package com.school.interfaces;

import com.school.model.people.Student;
import com.school.model.course.Course;
//interface for individuals that can expel students
public interface expellable {
    void expelStudent(Student student, Course course);
}

