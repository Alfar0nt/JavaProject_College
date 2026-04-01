package SecondSemester.aplikasiBarangPOS;

public class cGoods {
    //data
    private int id;
    private String name;
    private double price;
    private int stock;
    //mmethod
    cGoods() {
        //System.out.println("=== Ini adalah default Constructor ===");
    }
    cGoods(int i, String n, double p, int s) {
        id=i; name=n; price=p; stock=s;
        //System.out.println("=== Parameterized Constructor ===");
        System.out.println("Barang " + name+" Telah ditambahkan");
        /*System.out.println("ID: " + id);
        System.out.println("Harga: RP" + harga);
        System.out.println("Stok: " + stok);
        */
    }
    public void setPrice(double p) {price=p;}
    public void setStock(int s) {stock=s;}
    public int getId(){return id;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getStock(){return stock;}
    public String toString(){
        return id+" | "+name+" | "+price+" | "+stock;
    }

}
