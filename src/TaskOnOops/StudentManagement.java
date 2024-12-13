package TaskOnOops;

import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student id:");
        int id=scanner.nextInt();
        System.out.println("Enter the course:");
        String course=scanner.next();
        System.out.println("Enter the marks:");
        double marks=scanner.nextDouble();
        System.out.println("Enter the student name:");
        String name =scanner.next();
        System.out.println("Enter the student age:");
        int age =scanner.nextInt();

        Student student = new Student(id,course,marks,name,age );
        student.displayInfo();
        student.grade();

        System.out.println("Enter the Teacher id:");
        int Teacherid=scanner.nextInt();
        System.out.println("Enter the Teacher Name:");
        String Teachername=scanner.next();
        System.out.println("Enter the Teacher age:");
        int Teacherage=scanner.nextInt();
        System.out.println("Enter the subject:");
        String Subject=scanner.next();
        System.out.println("Enter the salary:");
        int salary=scanner.nextInt();
        Teacher Teacher=new Teacher(Teacherid,Teachername,Teacherage,Subject,salary);
        Teacher.displayInfo();
    }
}