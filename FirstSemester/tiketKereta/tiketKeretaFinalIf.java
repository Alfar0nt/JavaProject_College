package FirstSemester.tiketKereta;
import java.util.Scanner;
public class tiketKeretaFinalIf {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jenis tiket yang ingin anda beli (ekonomi, bisnis, eksekutif) ");
        String jenisTiket = input.nextLine();

        int ekonomi = 50000;
        int bisnis = 150000;
        int eksekutif = 300000;

        if (jenisTiket.equalsIgnoreCase("ekonomi")) {
            System.out.print("masukkan jumlah tiket yang ingin anda beli: ");
            int jumlahTiket = input.nextInt();
            input.close();

            if (jumlahTiket == 2) {
            int hargaTiket = ekonomi * 2;
            System.out.println("jumlah tiket yang anda beli adalah 2, dan jumlahnya adalah RP" + hargaTiket);
            } else {System.out.println("jumlah tiket " + jumlahTiket + " tidak tersedia");
                }
            } else {System.out.println("tiket " + jenisTiket + " tidak tersedia");
        }
    }
}
