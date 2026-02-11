package FirstSemester.KuisStudiCase.StudiCase2;

import java.util.Scanner;

public class ATMSetorTarik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int saldo = 0;  // saldo awal
        int pilihan;
        do {
            System.out.println("\n=== MENU ATM SEDERHANA ===");
            System.out.println("1. Setor Tunai");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();

            if (pilihan == 1) { 
                // Pilihan setor tunai
                System.out.print("Masukkan jumlah uang yang ingin disetor: ");
                int setor = input.nextInt();

                // nested if (pengecekan jumlah setor)
                if (setor >= 5000) {
                    saldo += setor; // tambahkan ke saldo
                    System.out.println("Setoran berhasil! Saldo Anda sekarang: Rp" + saldo);
                } else {
                    System.out.println("Setoran gagal! Minimal setoran adalah Rp5000.");
                }

            } else if (pilihan == 2) { 
                // Pilihan tarik tunai
                // Nested if untuk memastikan ada saldo cukup
                if (saldo < 5000) {
                    System.out.println("Saldo Anda belum cukup untuk melakukan penarikan.");
                    System.out.println("Silakan setor minimal Rp5000 terlebih dahulu.");
                } else {
                    System.out.print("Masukkan jumlah uang yang ingin ditarik: ");
                    int tarik = input.nextInt();

                    // Cek apakah setelah ditarik, saldo minimal 5000 tetap tersisa
                    if (tarik <= saldo - 5000) {
                        saldo -= tarik;
                        System.out.println("Penarikan berhasil! Sisa saldo: Rp" + saldo);
                    } else {
                        System.out.println("Penarikan gagal! Saldo minimal Rp5000 harus tersisa di rekening.");
                    }
                }

            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan ATM sederhana!");
            } else {
                System.out.println("Pilihan tidak valid! Silakan pilih menu yang benar.");
            }

        } while (pilihan != 3);  // selama belum pilih keluar

        input.close();
    }

}
