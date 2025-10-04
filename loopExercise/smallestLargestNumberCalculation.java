package loopExercise;
import java.util.Scanner;

public class smallestLargestNumberCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double number, smallest, largest;

        // === Using FOR loop ===
        System.out.println("=== Using FOR loop ===");
        System.out.print("Enter number of data: ");
        n = input.nextInt();

        System.out.print("Enter the 1st number: ");
        number = input.nextDouble();
        smallest = largest = number; // initial value

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter the " + i + " number: ");
            number = input.nextDouble();
            if (number < smallest) smallest = number;
            if (number > largest) largest = number;
        }

        System.out.println("Smallest Number = " + smallest);
        System.out.println("Largest Number = " + largest);
        System.out.println();

        // === Using WHILE loop ===
        System.out.println("=== Using WHILE loop ===");
        System.out.print("Enter number of data: ");
        n = input.nextInt();

        int i = 1;
        System.out.print("Enter the 1st number: ");
        number = input.nextDouble();
        smallest = largest = number;

        i++;
        while (i <= n) {
            System.out.print("Enter the " + i + " number: ");
            number = input.nextDouble();
            if (number < smallest) smallest = number;
            if (number > largest) largest = number;
            i++;
        }

        System.out.println("Smallest Number = " + smallest);
        System.out.println("Largest Number = " + largest);
        System.out.println();

        // === Using DO-WHILE loop ===
        System.out.println("=== Using DO-WHILE loop ===");
        System.out.print("Enter number of data: ");
        n = input.nextInt();

        i = 1;
        System.out.print("Enter the 1st number: ");
        number = input.nextDouble();
        smallest = largest = number;

        i++;
        do {
            if (i <= n) {
                System.out.print("Enter the " + i + " number: ");
                number = input.nextDouble();
                if (number < smallest) smallest = number;
                if (number > largest) largest = number;
                i++;
            }
        } while (i <= n);

        System.out.println("Smallest Number = " + smallest);
        System.out.println("Largest Number = " + largest);

        input.close();
    }
}
