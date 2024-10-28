import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private String lastName;
    private int studentNumber;

    public Student(String name, String lastName, int studentNumber) {
        this.name = name;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    // Sort method based on parameter
    public static void sortStudents(List<Student> students, String sortBy) {
        switch (sortBy.toLowerCase()) {
            case "name":
                Collections.sort(students, Comparator.comparing(Student::getName));
                break;
            case "lastname":
                Collections.sort(students, Comparator.comparing(Student::getLastName));
                break;
            case "studentnumber":
                Collections.sort(students, Comparator.comparingInt(Student::getStudentNumber));
                break;
            default:
                System.out.println("Invalid sort parameter");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }

}
