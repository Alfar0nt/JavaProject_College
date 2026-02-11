public class Item {
    public String nama;
    public int harga;
    public int stok;

    public Item(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return nama + "," + harga + "," + stok;
    }
}