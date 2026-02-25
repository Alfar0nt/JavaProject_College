package SecondSemester.ThirdMeet;

public class cBarang {
    //data
    private int id;
    private String nama;
    private double harga;
    private int stok;
    //mmethod
    cBarang() {
        //System.out.println("=== Ini adalah default Constructor ===");
    }
    cBarang(int i, String n, double h, int s) {
        id=i; nama=n; harga=h; stok=s;
        //System.out.println("=== Parameterized Constructor ===");
        System.out.println("Barang " + nama+" Telah ditambahkan");
        /*System.out.println("ID: " + id);
        System.out.println("Harga: RP" + harga);
        System.out.println("Stok: " + stok);
        */
    }
    public void setHarga(double h) {harga=h;}
    public void setStok(int s) {stok=s;}
    public int getId(){return id;}
    public String getNama(){return nama;}
    public double getHarga(){return harga;}
    public int getStok(){return stok;}
    public String toString(){
        return id+" | "+nama+" | "+harga+" | "+stok;
    }

}
