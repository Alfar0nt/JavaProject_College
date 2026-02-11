import java.util.*;

public class UserInterface {
    private static Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("\n1. Tambah Barang");
        System.out.println("2. Lihat Barang");
        System.out.println("3. Update Stok");
        System.out.println("4. Hapus Barang");
        System.out.println("5. Exit");
        System.out.print("Pilih: ");
    }

    public static int inputAngka(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                in.nextLine();
            }
        }
    }

    public static String inputText(String msg) {
        System.out.print(msg);
        in.nextLine();
        return in.nextLine();
    }
}