package TaskOf15Programs;

import java.util.Scanner;

public class CalculatorMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    int choice;

        do {
        System.out.println("\nMenu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Option-1 Selected: Add");
                break;
            case 2:
                System.out.println("Option-2 Selected: Subtract");
                break;
            case 3:
                System.out.println("Option-3 Selected: Multiply");
                break;
            case 4:
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                System.out.println("Exiting the program...");
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }
    } while (choice != 5);
}
}
