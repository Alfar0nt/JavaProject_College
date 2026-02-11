import java.util.Scanner;
public class tiketKeretaFinal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jenis tiket yang ingin anda beli (ekonomi, bisnis, eksekutif) ");
        String jenisTiket = input.nextLine();

        int ekonomi = 50000;
        int bisnis = 150000;
        int eksekutif = 300000;

        switch (jenisTiket) {
            case "ekonomi":
                System.out.print("masukkan jumlah tiket yang ingin anda beli: ");
                int jumlahTiket = input.nextInt();
                input.close();
                switch (jumlahTiket) {
                    case 2:
                        jumlahTiket =  ekonomi * 2;
                        System.out.println("Anda membeli tiket ekonomi. Jumlah tiket yang anda beli adalah 2");
                        System.out.println("Harga tiket total: RP" + jumlahTiket);
                        break;

                    default: System.out.println("jumlah tiket " + jumlahTiket + " tidak tersedia");
                break;
            }
            break;

            case "eksekutif":
                System.out.println("tiket eksekutif tidak tersedua");
                break;

            case "bisnis":
                System.out.println("tiket bisnis tidak tersedia");
                break;
        
            default: System.out.println("jenis tiket " + jenisTiket + " tidak tersedia");
                break;
        }
    }
}
