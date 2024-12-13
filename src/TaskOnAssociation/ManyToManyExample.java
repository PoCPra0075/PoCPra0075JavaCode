package TaskOnAssociation;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void displayStudents() {
        System.out.println("Course: " + name + ", Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }

    public void displayCourses() {
        System.out.println("Student: " + name + ", Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }
}

public class ManyToManyExample {
    public static void main(String[] args) {
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.enroll(math);
        alice.enroll(science);
        bob.enroll(math);

        math.displayStudents();
        science.displayStudents();
        alice.displayCourses();
        bob.displayCourses();
    }
}