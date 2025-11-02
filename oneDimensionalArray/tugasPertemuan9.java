package oneDimensionalArray;

import java.util.Scanner;

public class tugasPertemuan9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[5]; // untuk menyimpan 5 nilai input

        // Input nilai dari pengguna
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        // Proses mencari nilai tertinggi dan terendah
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        // Output hasil
        System.out.println("Nilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah = " + terendah);
        
        input.close();
    }
}
