package tests.model.people;

import com.school.model.people.Student;
import com.school.model.course.Course;

public class StudentTest {

    public static void main(String[] args) {
        // Create student
        Student student = new Student("John Doe", 20);

        // Create courses
        Course math = new Course("Math");
        Course science = new Course("Science");
        Course history = new Course("History");
        Course art = new Course("Art");

        // Enroll student in courses
        student.takeCourse(math);
        student.takeCourse(science);
        student.takeCourse(history);
        student.takeCourse(art); // should exceed MAX_COURSES

        printStudentCourses(student);
        printCourseStudents(math);
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
