package TaskOf15Programs;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        System.out.print("Enter n value : ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers between 1 to " + n + " are ");
        for (int i = 2; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    }
                }
            if (count == 2) {
                System.out.print(i + " ");
                }
            }
        }
    }