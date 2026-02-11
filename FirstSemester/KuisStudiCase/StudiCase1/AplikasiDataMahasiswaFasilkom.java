package FirstSemester.KuisStudiCase.StudiCase1;
import java.util.Scanner;

public class AplikasiDataMahasiswaFasilkom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sistemInformasi = 0;
        int informatika = 0;
        int sainsData = 0;
        int ulang;

        do {
            System.out.println("=== Input Kehadiran Mahasiswa Fasilkom ===");
            System.out.println("1. Sistem Informasi");
            System.out.println("2. Informatika");
            System.out.println("3. Sains Data");
            System.out.print("Pilih prodi (1-3): ");
            int pilihan = input.nextInt();

            // Percabangan dengan perulangan for di dalamnya
            if (pilihan == 1) {
                System.out.print("Masukkan jumlah mahasiswa Sistem Informasi yang hadir: ");
                int jumlah = input.nextInt();
                for (int i = 0; i < jumlah; i++) {
                    sistemInformasi++;
                }
                System.out.println("Data kehadiran untuk Sistem Informasi sebanyak " + jumlah + " berhasil ditambahkan!");
            } 
            else if (pilihan == 2) {
                System.out.print("Masukkan jumlah mahasiswa Informatika yang hadir: ");
                int jumlah = input.nextInt();
                for (int i = 0; i < jumlah; i++) {
                    informatika++;
                }
                System.out.println("Data kehadiran untuk Informatika sebanyak " + jumlah + " berhasil ditambahkan!");
            } 
            else if (pilihan == 3) {
                System.out.print("Masukkan jumlah mahasiswa Sains Data yang hadir: ");
                int jumlah = input.nextInt();
                for (int i = 0; i < jumlah; i++) {
                    sainsData++;
                }
                System.out.println("Data kehadiran untuk Sains Data sebanyak " + jumlah + " berhasil ditambahkan!");
            } 
            else {
                System.out.println("Pilihan tidak valid!");
            }
               System.out.println("\n=== Rekap Kehadiran Mahasiswa ===");
                System.out.println("Sistem Informasi : " + sistemInformasi + " mahasiswa");
                System.out.println("Informatika      : " + informatika + " mahasiswa");
                System.out.println("Sains Data       : " + sainsData + " mahasiswa");
            System.out.print("Apakah ingin menginputkan data lagi? (1 = ya) (2 = tidak): ");
            ulang = input.nextInt();

        } while (ulang == 1);

        // Menampilkan hasil akhir menggunakan switch
        switch (ulang) {
            case 2:
                System.out.println("\n=== Rekap Kehadiran Mahasiswa ===");
                System.out.println("Sistem Informasi : " + sistemInformasi + " mahasiswa");
                System.out.println("Informatika      : " + informatika + " mahasiswa");
                System.out.println("Sains Data       : " + sainsData + " mahasiswa");
                break;
        
            default:
                System.out.println("Input " + ulang + " tidak ditemukan");
                break;
        }

        input.close();
    }
}
