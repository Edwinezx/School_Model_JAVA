package tests.model.people;

import com.school.model.people.Applicant;
import com.school.model.people.Student;
public class ApplicantTest {

    public static void main(String[] args) {
        int minAge = 5;
        int maxAge = 22;

        Applicant a1 = new Applicant("Jane Doe", 20);
        Applicant a2 = new Applicant("John Smith", 4);
        Applicant a3 = new Applicant("Alice Brown", 23);

        //Testing if the applicants can be admitted based on age
        testAdmission(a1, minAge, maxAge);
        testAdmission(a2, minAge, maxAge);
        testAdmission(a3, minAge, maxAge);
    }

    private static void testAdmission(Applicant applicant, int minAge, int maxAge) {
        System.out.print("Testing applicant " + applicant.getName() + ": ");
        if (applicant.meetsAgeRequirement(minAge, maxAge)) {
            System.out.println("Meets age requirement. Admitting...");
            Student student = applicant.toStudent();
            System.out.println("Student created: " + student.getName() + ", Age: " + student.getAge());
        } else {
            System.out.println("Does NOT meet age requirement. Cannot admit.");
        }
    }
}
