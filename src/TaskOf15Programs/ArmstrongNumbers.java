package TaskOf15Programs;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Armstrong numbers between 1 and 1000 are:");

        int Limit = scanner.nextInt();
        if (Limit > 1000) {
            System.out.println("Please enter a number less than or equal to 1000.");
            return;
        }
        System.out.println("Armstrong numbers between 1 and " + Limit + " are:");
        for (int number = 1; number <= Limit; number++) {
            int sum = 0;
            int temp = number;
            int digits = String.valueOf(number).length();

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit,digits);
                temp /= 10;
            }

            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
