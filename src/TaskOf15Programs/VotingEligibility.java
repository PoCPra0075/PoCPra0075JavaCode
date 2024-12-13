package TaskOf15Programs;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 100) {
            System.out.println("Eligible to vote.");
        } else if (age < 18) {
            System.out.println("Not eligible to vote.");
        } else if (age > 100) {
            System.out.println("Incorrect age.");
        }
    }
}
