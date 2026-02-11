package loopExercise;
import java.util.Scanner;

public class smallestLargestNumberCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number, smallest, largest;
        int i;

        // === FOR loop ===
        System.out.println("=== Using FOR loop ===");
        System.out.print("Enter the 1st number = ");
        number = input.nextDouble();
        smallest = largest = number;

        for (i = 2; i <= 3; i++) {
            System.out.print("Enter the " + i + " number = ");
            number = input.nextDouble();
            if (number < smallest) smallest = number;
            if (number > largest) largest = number;
        }
        System.out.println("Smallest Number = " + smallest);
        System.out.println("Largest Number = " + largest);
        System.out.println();

        // === WHILE loop ===
        System.out.println("=== Using WHILE loop ===");
        System.out.print("Enter the 1st number = ");
        number = input.nextDouble();
        smallest = largest = number;
        i = 2;
        while (i <= 3) {
            System.out.print("Enter the " + i + " number = ");
            number = input.nextDouble();
            if (number < smallest) smallest = number;
            if (number > largest) largest = number;
            i++;
        }
        System.out.println("Smallest Number = " + smallest);
        System.out.println("Largest Number = " + largest);
        System.out.println();

        // === DO-WHILE loop ===
        System.out.println("=== Using DO-WHILE loop ===");
        System.out.print("Enter the 1st number = ");
        number = input.nextDouble();
        smallest = largest = number;
        i = 2;
        do {
            System.out.print("Enter the " + i + " number = ");
            number = input.nextDouble();
            if (number < smallest) smallest = number;
            if (number > largest) largest = number;
            i++;
        } while (i <= 3);
        System.out.println("Smallest Number = " + smallest);
        System.out.println("Largest Number = " + largest);

        input.close();
    }
}
