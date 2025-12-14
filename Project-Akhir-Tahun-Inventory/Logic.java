import java.io.*;
import java.util.*;

public class Logic {
    public static ArrayList<Item> inventory = new ArrayList<>();
    private static final String FILE = "data.txt";

    // Dipanggil saat aplikasi mulai
    public static void loadData() {
        try (Scanner sc = new Scanner(new File(FILE))) {
            while (sc.hasNextLine()) {
                String[] d = sc.nextLine().split(",");
                inventory.add(new Item(d[0], Integer.parseInt(d[1]), Integer.parseInt(d[2])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File belum ada, akan dibuat otomatis.");
        }
    }

    // Simpan ulang ke file (overwrite)
    private static void saveData() {
        try (FileWriter fw = new FileWriter(FILE)) {
            for (Item i : inventory) fw.write(i + "\n");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data");
        }
    }

    public static void addItem(Item item) {
        inventory.add(item);
        saveData();
    }

    public static void updateStock(int index, int stokBaru) {
        inventory.get(index).stok = stokBaru;
        saveData();
    }

    public static void deleteItem(int index) {
        inventory.remove(index);
        saveData();
    }
}