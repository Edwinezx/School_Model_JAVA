package com.school.model.course;

import com.school.model.people.Student;
import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Adds student to this course if not already added
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);

            // Also add this course to the student's list if not already added
            if (!student.getCourses().contains(this)) {
                student.takeCourse(this); // ensures bidirectional link
            }
        }
    }

    // Removes a student from this course
    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students); // defensive copy
    }

    public String getCourseName() {
        return courseName;
    }
}
