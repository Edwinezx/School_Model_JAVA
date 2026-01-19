package tests.model.people.staff;

import com.school.model.people.staff.academic.Principal;
import com.school.model.course.Course;
import com.school.model.people.Applicant;
import com.school.model.people.Student;

import java.util.List;

public class PrincipalTest {

    public static void main(String[] args) {
        // Create a principal
        Principal principal = new Principal("Dr. Smith", 50, "P001");

        // Create applicants
        Applicant a1 = new Applicant("Jane Doe", 20); // valid
        Applicant a2 = new Applicant("John Smith", 23); // invalid
        Applicant a3 = new Applicant("Alice Brown", 19); // valid

        // Admit applicants
        System.out.println("\n--- Admitting applicants ---");
        principal.admitApplicant(a1); // should be admitted
        principal.admitApplicant(a2); // should fail
        principal.admitApplicant(a3); // should be admitted

        // Check admitted students
        System.out.println("\nAdmitted students by Principal:");
        List<Student> admitted = principal.getStudents();
        for (Student s : admitted) {
            System.out.println("- " + s.getName());
        }

        // Create courses
        Course course  = new Course("Math");
        Course course1 = new Course("Science");

        // Enroll admitted students manually
        for (Student s : admitted) {
            s.takeCourse(course);
            s.takeCourse(course1);
        }

        // Print course enrollments
        System.out.println("\nStudents in Math:");
        course.getStudents().forEach(s -> System.out.println("- " + s.getName()));

        System.out.println("\nStudents in Science:");
        course1.getStudents().forEach(s -> System.out.println("- " + s.getName()));

        // Expelling a student
        System.out.println("\n--- Expelling a student ---");
        Student studentToExpel = admitted.getFirst();
        principal.expelStudent(studentToExpel, course);

        // Verifying updates
        System.out.println("\nAfter expulsion:");
        System.out.println("Student(s) left:");
        principal.getStudents().forEach(s -> System.out.println("- " + s.getName()));

        System.out.println("Students in Math:");
        course.getStudents().forEach(s -> System.out.println("- " + s.getName()));
    }
}
