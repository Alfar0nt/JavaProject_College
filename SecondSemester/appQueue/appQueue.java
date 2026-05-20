package SecondSemester.appQueue;

import java.util.Scanner;

class Order{
    String item;
    int price;
    int qty;
    Order(String i, int p, int q){
        item=i; price=p; qty=q;
    }
    String getItem(){ return item; }
    int getPrice(){ return price; }
    int getQty(){ return qty; }
}
class Node{
    Order order;
    Node next;
    Node(){}

}
class Queue{
    Node front,rear;
    int count, total;
    Queue(){}
    void enqueue(Node OrderNode){
        if (rear==null) {
            front=rear=OrderNode;
        }else {
            rear.next=OrderNode;
            rear=OrderNode;
        }
        total=total+(OrderNode.order.price*OrderNode.order.qty);
    }
    void dequeue(){
        Node t=front;
        if (t==null) {
            System.out.println( "Queue is empty");
        }else if(t.next==null){
            front=rear=null;
        }else{
            front=front.next;
            t.next=null;
        }
        if(t==null){
            System.out.println("Empty Queue");
        }else{
            System.out.println(t.order.item + " Out");
        }
    }
    void view(){
        System.out.println("Order Queue");
        for(Node t=front; t!=null; t=t.next){
            System.out.println("[t"+t.order.item+","+t.order.qty+"]");
        }
        System.out.println("");
    }
}
public class appQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        int choice=0;
        do{
            System.out.println("App Queue");
            System.out.println("1. Enqueue\n2. Dequeue\n3. View");
            System.out.println("4. Exit");
            System.out.print("Choice = ");
            choice=sc.nextInt();
        }while(choice!=4);
    }

}
