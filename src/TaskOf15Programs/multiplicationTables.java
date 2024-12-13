package TaskOf15Programs;

import java.util.Scanner;

public class multiplicationTables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the multiplication tables: ");
        int n = scanner.nextInt();

        for (int i = n; i <= n; i++) {
            System.out.println("Multiplication Table for " + i + ":");
        for (int j = 1; j <= 10; j++) {

            System.out.println(i + " x " + j + " = " + (i * j));
        }
        System.out.println();
        }
    }
}
