package SecondSemester.aplikasiBarangPOS;

public class cSales {
    private int code;
    private cGoods goods;
    private cBuyer;
    private int qty;
    private double total;
    cSales(){};
    public void addSales(int c, cGoods g, cBuyer b, ing q){
        code=c; goods=g; buyer=b; qty=q;
        total=q*goods.getPrice();
    }
    public void printSales(){
        System.out.println("Sales");
        System.out.println("Code: "+code);
        System.out.println("Goods: "+goods);
        System.out.println("Buyer: "+buyer);
        System.out.println("Quantity: "+qty);
        System.out.println("Prices:" +goods.getPrice);
        System.out.println("TOtal: "+total);
    }
}
