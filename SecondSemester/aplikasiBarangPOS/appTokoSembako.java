package SecondSemester.aplikasiBarangPOS;

public class appTokoSembako {
    public static void main(String[] args) {
        System.out.println("=== APLIKASI POS ===");
        cGoods nasi = new cGoods(); //consturctornya kepanggil / ke execute, padahal gak pernah dipanggil, jadi dikerjain otomatis
        cGoods telor = new cGoods(123,"Telor",300.000,10);
        cGoods tepung = new cGoods(1, "Tepung Terigu", 10.000, 15);

        telor.setPrice(250.000);
        telor.setStock(11);

        System.out.println("ID: " +telor.getId());
        System.out.println("Harga: " +telor.getPrice());
        System.out.println("Stok: " +telor.getStock());
        System.out.println("===");
        System.out.println("Barang: " +telor.toString());
    }

}