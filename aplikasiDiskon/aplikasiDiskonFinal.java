import java.util.Scanner;
public class aplikasiDiskonFinal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total harga barang: ");
        double total = input.nextDouble();
        input.nextLine();

        System.out.print("Apakah anda punya member? (Ya/Tidak) ");
        String member = input.nextLine();
        input.close();

        //System.out.println(total);
        //System.out.println(member);

        if (member.equalsIgnoreCase("ya")) {
            if (total >= 100000) {
                double diskonMember = 5000;
                double totalDiskon = total - diskonMember;
                System.out.println("Total Belanja RP" + total + " dikurangi diskon member sebesar RP" + diskonMember + " Total pembayaran RP" + totalDiskon);
            } else {System.out.println("Total Belanja = " + total + " tidak mendapatkan diskon");
            }
            
         } else if (total >= 80000) {
            double diskonNonMember = 2000;
            double totalDiskon = total - diskonNonMember;
            System.out.println("Total Belanja RP" + total + " dikurangin diskon non member RP" + diskonNonMember + " Total pembayaran RP" + totalDiskon);
            } else {System.out.println("Total Belanja RP= " + total + " tidak mendapatkan diskon");
            }

        }
    }
