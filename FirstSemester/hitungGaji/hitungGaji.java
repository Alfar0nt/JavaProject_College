package FirstSemester.hitungGaji;

import java.util.Scanner;

public class hitungGaji {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // input gaji pokok
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();

        // tambah tunjangan
        double tunjangan = gajiPokok * 0.30;

        // kurangi pajak
        double potongan = gajiPokok * 0.10;

        // hitung
        double gajiDiterima = gajiPokok + tunjangan - potongan;

        System.out.println("\n=== Rincian Gaji ===");
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Potongan (10%): Rp " + potongan);
        System.out.println("Tunjangan (30%): Rp " + tunjangan);
        System.out.println("Gaji Diterima : Rp " + gajiDiterima);

        input.close();
    }
}
