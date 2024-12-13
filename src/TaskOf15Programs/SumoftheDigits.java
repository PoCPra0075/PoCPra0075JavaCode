package TaskOf15Programs;

import java.util.Scanner;

public class SumoftheDigits {

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("The sum of the digits is: " + sum);
        }
    }