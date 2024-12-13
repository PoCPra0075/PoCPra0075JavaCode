package TaskOf15Programs;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the Third number: ");
        int num3 = scanner.nextInt();

        int largest;

        if (num1 >= num2 && num1 >=num3) {
            largest = num1;
        } else if (num2 >=num1 && num2 >= num3){
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);
    }
}
