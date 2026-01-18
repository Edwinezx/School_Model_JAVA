package com.school.model.people.staff.academic;

import com.school.interfaces.admittable;
import com.school.interfaces.expellable;
import com.school.model.course.Course;
import com.school.model.people.Applicant;
import com.school.model.people.Student;

import java.util.ArrayList;
import java.util.List;

public class Principal extends AcademicStaff implements admittable, expellable {

    private List<Student> students = new ArrayList<>();

    public Principal(String name, int age, String staffId) {
        super(name, age, staffId);
    }

    // Admit an already-created student
    @Override
    public void admitNewStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student.getName() + " has been admitted by Principal.");
        }
    }

    // Admit via applicant (age check happens here)
    public void admitApplicant(Applicant applicant) {
        if (applicant.meetsAgeRequirement(5, 21)) {
            admitNewStudent(applicant.toStudent());
        } else {
            System.out.println(applicant.getName() + " does not meet age requirements.");
        }
    }

    // Expel a student from a course and from the principal's list
    @Override
    public void expelStudent(Student student, Course course) {
        course.removeStudent(student);
        students.remove(student);
        System.out.println(student.getName() + " has been expelled by Principal.");
    }

    // Get list of admitted students
    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }
}
