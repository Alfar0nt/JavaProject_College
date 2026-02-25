package SecondSemester.ThirdMeet;

public class appTokoSembako {
    public static void main(String[] args) {
        System.out.println("=== APLIKASI POS ===");
        cBarang nasi = new cBarang(); //consturctornya kepanggil / ke execute, padahal gak pernah dipanggil, jadi dikerjain otomatis
        cBarang telor = new cBarang(123,"Telor",300.000,10);
        cBarang tepung = new cBarang(1, "Tepung Terigu", 10.000, 15);

        telor.setHarga(250.000);
        telor.setStok(11);

        System.out.println("ID: " +telor.getId());
        System.out.println("Harga: " +telor.getHarga());
        System.out.println("Stok: " +telor.getStok());
        System.out.println("===");
        System.out.println("Barang: " +telor.toString());
    }

}