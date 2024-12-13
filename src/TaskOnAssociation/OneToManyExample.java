package TaskOnAssociation;

import java.util.ArrayList;
import java.util.List;

class Teacher {
    private String name;
    private List<Student> students;

    public Teacher(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayDetails() {
        System.out.println("Teacher: " + name);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

class Student1 {
    private String name;

    public Student1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class OneToManyExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ms. Smith");
        teacher.addStudent(new Student("Alice"));
        teacher.addStudent(new Student("Bob"));
        teacher.addStudent(new Student("Naveen"));

        teacher.displayDetails();
    }
}
