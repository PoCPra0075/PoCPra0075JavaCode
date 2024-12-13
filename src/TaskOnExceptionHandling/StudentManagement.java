package TaskOnExceptionHandling;

import java.io.*;
import java.sql.*;
import java.util.*;

public class StudentManagement {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Demonstrating ArithmeticException
            System.out.println("Enter total marks of all students:");
            int totalMarks = scanner.nextInt();
            System.out.println("Enter number of students:");
            int numberOfStudents = scanner.nextInt();

            Student student = new Student("John Doe", totalMarks);
            int averageMarks = student.calculateAverageMarks(numberOfStudents);
            System.out.println("Average Marks: " + averageMarks);

            // Demonstrating ArrayIndexOutOfBoundsException
            String[] students = {"Alice", "Bob", "Charlie", "raven"};
            System.out.println("Enter the student index to fetch (0-8):");
            int index = scanner.nextInt();
            System.out.println("Student: " + students[index]);

            // Demonstrating NullPointerException
            Teacher teacher = null;
            teacher.printTeacherDetails(); // This will throw NullPointerException

            // Demonstrating IOException
            System.out.println("Enter a file name to read:");
            String fileName = scanner.next();
            FileReader fileReader = new FileReader(fileName); // This will throw IOException
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("File content: " + bufferedReader.readLine());
            bufferedReader.close();

            // Demonstrating SQLException
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "password"); // This will throw SQLException if connection fails
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
            while (resultSet.next()) {
                System.out.println("Student Name: " + resultSet.getString("name"));
            }

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}