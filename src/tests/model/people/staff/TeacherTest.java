package tests.model.people.staff;

import com.school.model.people.staff.academic.Teacher;
import com.school.model.course.Course;

public class TeacherTest {

    public static void main(String[] args) {
        // Create teacher
        Teacher teacher = new Teacher("Mr. Johnson", 35);

        // Create courses
        Course course = new Course("Math");
        Course course1 = new Course("Science");
        Course course2 = new Course("History");
        Course course3 = new Course("Art");

        // Teacher teaches courses
        System.out.println("\n--- Assigning courses to teacher ---");
        teacher.teachCourse(course);
        teacher.teachCourse(course1);
        teacher.teachCourse(course2);
        teacher.teachCourse(course3); // exceeds max, should not be added

        // Print courses the teacher teaches
        System.out.println("\nCourses taught by " + teacher.getName() + ":");
        for (Course c : teacher.getCourses()) {
            System.out.println("- " + c.getCourseName());
        }

        // Check availability
        System.out.println("\nIs teacher available for more courses? " + teacher.isAvailable());
    }
}
