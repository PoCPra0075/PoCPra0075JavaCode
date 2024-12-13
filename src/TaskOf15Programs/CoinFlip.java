package TaskOf15Programs;

import java.util.Scanner;

public class CoinFlip {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int flips = scanner.nextInt();

        int heads = 0;
        int tails = 0;

        for (int i = 1; i <= flips; i++) {
            int result = (int) (Math.random() * 2);

            if (result == 0) {
                tails++;
                System.out.println("Flip " + i + ": Tails");
            } else {
                heads++;
                System.out.println("Flip " + i + ": Heads");
            }
        }

        System.out.println("Total flips: " + flips);
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);

    }
}
