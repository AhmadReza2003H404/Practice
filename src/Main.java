import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void addStudents(){
        List<Student> students = new ArrayList<>();
        // developers please change this part and don't touch other parts, just add students to list
        students.add(new Student("Ahmadreza", "hosseini", 8030));
        students.add(new Student("Yasin", "Nazari", 8041));
        students.add(new Student("Mohammad", "Sedighi", 8042));

        students.add(new Student("Behraz", "Fereshte", 8053));
        students.add(new Student("Ali", "Fakheri", 8022));
        students.add(new Student("Iman", "Bohlool", 802));

        // don't touch this methods
        System.out.println("Before sorting:");
        students.forEach(System.out::println);

        Student.sortStudents(students, "name");
        System.out.println("\nAfter sorting by name:");
        students.forEach(System.out::println);

        Student.sortStudents(students, "studentnumber");
        System.out.println("\nAfter sorting by student number:");
        students.forEach(System.out::println);
    }


    public static void main(String[] args) {
        addStudents();
    }
}