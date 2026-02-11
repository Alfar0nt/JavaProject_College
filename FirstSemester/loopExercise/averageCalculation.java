package FirstSemester.loopExercise;
import java.util.Scanner;

public class averageCalculation {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double number, total, average;

        // === Using FOR loop ===
        System.out.println("=== Using FOR loop ===");
        total = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter the " + i + " number = ");
            number = input.nextDouble();
            total += number;
        }
        average = total / 3;
        System.out.println("The average value of 3 numbers is " + average);
        System.out.println();

        // === Using WHILE loop ===
        System.out.println("=== Using WHILE loop ===");
        int i = 1;
        total = 0;
        while (i <= 3) {
            System.out.print("Enter the " + i + " number = ");
            number = input.nextDouble();
            total += number;
            i++;
        }
        average = total / 3;
        System.out.println("The average value of 3 numbers is " + average);
        System.out.println();

        // === Using DO-WHILE loop ===
        System.out.println("=== Using DO-WHILE loop ===");
        i = 1;
        total = 0;
        do {
            System.out.print("Enter the " + i + " number = ");
            number = input.nextDouble();
            total += number;
            i++;
        } while (i <= 3);
        average = total / 3;
        System.out.println("The average value of 3 numbers is " + average);

        input.close();
    }
}
