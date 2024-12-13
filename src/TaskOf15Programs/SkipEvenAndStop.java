package TaskOf15Programs;

import java.util.Scanner;

public class SkipEvenAndStop {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i > 20) {
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    }
