package TaskOf15Programs;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
 /*   int i,fact=1;
    int number=5;//It is the number to calculate factorial
  for(i=1;i<=number;i++){
        fact=fact*i;
    }
  System.out.println("Factorial of "+number+" is: "+fact);*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by the current number
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
