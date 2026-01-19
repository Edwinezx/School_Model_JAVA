package tests.model.people;

import com.school.model.people.Student;
import com.school.model.course.Course;

public class StudentTest {

    public static void main(String[] args) {
        // Create student
        Student student = new Student("John Doe", 20);

        // Create courses
        Course course = new Course("Math");
        Course course1 = new Course("Science");
        Course course2 = new Course("History");
        Course course3 = new Course("Art");

        // Enroll student in courses
        student.takeCourse(course);
        student.takeCourse(course1);
        student.takeCourse(course2);
        student.takeCourse(course3); // should exceed MAX_COURSES

        printStudentCourses(student);
        printCourseStudents(course);
    }

    private static void printStudentCourses(Student student) {
        System.out.print(student.getName() + " is taking: ");
        student.getCourses().forEach(c -> System.out.print(c.getCourseName() + " "));
        System.out.println();
    }

    private static void printCourseStudents(Course course) {
        System.out.print("Students in " + course.getCourseName() + ": ");
        course.getStudents().forEach(s -> System.out.print(s.getName() + " "));
        System.out.println();
    }
}
