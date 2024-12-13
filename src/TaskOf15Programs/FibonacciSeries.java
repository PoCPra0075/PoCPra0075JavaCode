package TaskOf15Programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        /*int n = 10; // Number of terms to be printed
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series using Iterative Approach: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 +" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + terms + " terms:");

        if (terms >= 1) {
            System.out.print(first + " ");
        }

        if (terms >= 2) {
            System.out.print(second + " ");
        }

        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}
