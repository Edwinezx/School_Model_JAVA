package tests.model.course;

import com.school.model.course.Course;
import com.school.model.people.Student;

public class CourseTest {

    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Alice", 19);
        Student s2 = new Student("Bob", 20);

        // Creating a course
        Course course = new Course("Science");

        // Adding students to course
        course.addStudent(s1);
        course.addStudent(s2);
        course.addStudent(s1); // duplicating should not work

        // Print students in the course
        System.out.println("Students enrolled in " + course.getCourseName() + ":");
        for (Student s : course.getStudents()) {
            System.out.println("- " + s.getName());
        }

        // Print courses for each student
        System.out.println("\nCourses for each student:");
        printStudentCourses(s1);
        printStudentCourses(s2);

        // Remove a student
        System.out.println("\nRemoving Alice from course...");
        course.removeStudent(s1);

        System.out.println("Students in " + course.getCourseName() + " after removal:");
        for (Student s : course.getStudents()) {
            System.out.println("- " + s.getName());
        }

        printStudentCourses(s1); // Alice’s course list may still contain Math
    }

    private static void printStudentCourses(Student student) {
        System.out.print(student.getName() + " is enrolled in: ");
        for (Course c : student.getCourses()) {
            System.out.print(c.getCourseName() + " ");
        }
        System.out.println();
    }
}
