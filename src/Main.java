public class Main {

    public static void addStudents(){
        List<Student> students = new ArrayList<>();
        // developers please change this part and don't touch other parts, just add students to list


        // don't touch this methods
        System.out.println("Before sorting:");
        students.forEach(System.out::println);

        sortStudents(students, "name");
        System.out.println("\nAfter sorting by name:");
        students.forEach(System.out::println);

        sortStudents(students, "studentnumber");
        System.out.println("\nAfter sorting by student number:");
        students.forEach(System.out::println);
    }


    public static void main(String[] args) {
        addStudents();
    }
}