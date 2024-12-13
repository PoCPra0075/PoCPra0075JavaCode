package TaskOnExceptionHandling;

public class Student {
    private String name;
    private int totalMarks;

    public Student(String name, int totalMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
    }

    // Method to calculate average marks
    public int calculateAverageMarks(int numberOfStudents) {
        if (numberOfStudents == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return totalMarks / numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}
