package loopExercise;
import java.util.Scanner;

public class averageCalculation {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double number, total, average;

        // === Using FOR loop ===
        System.out.println("=== Using FOR loop ===");
        System.out.print("Enter the number of numbers: ");
        n = input.nextInt();

        total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the " + i + " number: ");
            number = input.nextDouble();
            total += number;
        }
        average = total / n;
        System.out.println("The average value of " + n + " numbers is " + average);
        System.out.println();

        // === Using WHILE loop ===
        System.out.println("=== Using WHILE loop ===");
        System.out.print("Enter the number of numbers: ");
        n = input.nextInt();

        int i = 1;
        total = 0;
        while (i <= n) {
            System.out.print("Enter the " + i + " number: ");
            number = input.nextDouble();
            total += number;
            i++;
        }
        average = total / n;
        System.out.println("The average value of " + n + " numbers is " + average);
        System.out.println();

        // === Using DO-WHILE loop ===
        System.out.println("=== Using DO-WHILE loop ===");
        System.out.print("Enter the number of numbers: ");
        n = input.nextInt();

        i = 1;
        total = 0;
        do {
            System.out.print("Enter the " + i + " number: ");
            number = input.nextDouble();
            total += number;
            i++;
        } while (i <= n);

        average = total / n;
        System.out.println("The average value of " + n + " numbers is " + average);

        input.close();
    }
}
