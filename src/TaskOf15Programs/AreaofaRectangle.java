package TaskOf15Programs;

import java.util.Scanner;

public class AreaofaRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length=scanner.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        double width=scanner.nextDouble();

        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }

}

