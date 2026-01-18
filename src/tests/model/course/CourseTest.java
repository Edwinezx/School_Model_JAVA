package tests.model.course;

import com.school.model.course.Course;
import com.school.model.people.Student;

public class CourseTest {

    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Alice", 19);
        Student s2 = new Student("Bob", 20);

        // Create a course
        Course math = new Course("Math");

        // Add students to course
        math.addStudent(s1);
        math.addStudent(s2);
        math.addStudent(s1); // duplicate, should not add again

        // Print students in the course
        System.out.println("Students in " + math.getCourseName() + ":");
        for (Student s : math.getStudents()) {
            System.out.println("- " + s.getName());
        }

        // Print courses for each student
        System.out.println("\nCourses for each student:");
        printStudentCourses(s1);
        printStudentCourses(s2);

        // Remove a student
        System.out.println("\nRemoving Alice from Math...");
        math.removeStudent(s1);

        System.out.println("Students in " + math.getCourseName() + " after removal:");
        for (Student s : math.getStudents()) {
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
