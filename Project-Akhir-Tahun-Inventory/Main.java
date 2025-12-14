public class Main {
    public static void main(String[] args) {
        Logic.loadData();

        while (true) {
            UserInterface.menu();
            int pilih = UserInterface.inputAngka("");

            if (pilih == 1) {
                String nama = UserInterface.inputText("Nama: ");
                int harga = UserInterface.inputAngka("Harga: ");
                int stok = UserInterface.inputAngka("Stok: ");
                Logic.addItem(new Item(nama, harga, stok));
            }
            else if (pilih == 2) {
                for (int i = 0; i < Logic.inventory.size(); i++) {
                    Item it = Logic.inventory.get(i);
                    System.out.println((i + 1) + ". " + it.nama + " | Harga RP." + it.harga + " | Stok: " + it.stok);
                }
            }
            else if (pilih == 3) {
                int i = UserInterface.inputAngka("Index (mulai dari 1): ") - 1;
                int s = UserInterface.inputAngka("Stok baru: ");
                Logic.updateStock(i, s);
            }
            else if (pilih == 4) {
                int i = UserInterface.inputAngka("Index (mulai dari 1): ") - 1;
                Logic.deleteItem(i);
            }
            else break;
        }
        System.out.println("Program selesai");
    }
}