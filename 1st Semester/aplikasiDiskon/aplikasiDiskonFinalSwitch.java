import java.util.Scanner;
public class aplikasiDiskonFinalSwitch {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total harga barang: ");
        int total = input.nextInt();
        input.nextLine();

        System.out.print("Apakah anda punya member? (Ya/Tidak) ");
        String member = input.nextLine();
        input.close();

        switch (total) {
            case 100000: {
                // sayang sekali switch case di java tidak support lebih dari atau kurang dari (>= // <=)
                switch (member) {
                    case "ya": {
                        int totalDiskon = total - 5000;
                        System.out.println("total belanja anda adalah " + total + " dan dikuraing diskon member sebesar 5000, jadi total harga barang " + totalDiskon);
                    }
                        
                        break;
                
                    default: {
                        int totalDiskon = total - 2000;
                        System.out.println("total belanja anda adalah " + total + "dikurangin diskon non member sebesar 2000, jadi total bayar anda " + totalDiskon);
                    }
                    // belom kelar, mager nyelesainnya
                        break;
                }
            }
                
                break;
        
            default:
                break;
        }
        }
    }