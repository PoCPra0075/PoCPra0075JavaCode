package TaskOf15Programs;
import java.util.Scanner;

public class BreakAndContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to stop the loop: ");
        int stopNumber = scanner.nextInt();

        System.out.print("Enter the number to skip: ");
        int skipNumber = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            if (i == stopNumber) {
                System.out.println("Loop stopped at number: " + i);
                break;
            }
            if (i == skipNumber) {
                System.out.println("Loop skipped at number: " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
