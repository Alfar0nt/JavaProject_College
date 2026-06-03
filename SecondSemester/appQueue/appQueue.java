package SecondSemester.appQueue;

import java.util.Scanner;

class Order {
    String name;
    String item;
    int price;
    int qty;

    Order(String n, String i, int p, int q) {
        name = n;
        item = i;
        price = p;
        qty = q;
    }

    String getName() {
        return name;
    }

    String getItem() {
        return item;
    }

    int getPrice() {
        return price;
    }

    int getQty() {
        return qty;
    }
}

class Node {
    Order order;
    Node next;

    Node() {
    }

}

class Queue {
    Node front, rear;
    int count, total;

    Queue() {
    }

    void enqueue(Node OrderNode) {
        if (rear == null) {
            front = rear = OrderNode;
        } else {
            rear.next = OrderNode;
            rear = OrderNode;
        }
        total = total + (OrderNode.order.price * OrderNode.order.qty);
    }

    void dequeue() {
        Node t = front;
        if (t == null) {
            System.out.println("Queue is empty");
        } else if (t.next == null) {
            front = rear = null;
        } else {
            front = front.next;
            t.next = null;
        }
        if (t == null) {
            System.out.println("Empty Queue");
        } else {
            System.out.println(t.order.item + " Out");
        }
    }

    void view() {
        System.out.println("=======");
        System.out.println("Order Queue");
        for (Node t = front; t != null; t = t.next) {
            System.out.print("[" + t.order.name + "]");
            System.out.println("[" + t.order.item + ", " + t.order.qty + ", RP" + t.order.price + "]");
        }
        System.out.println("=======");
    }
}

public class appQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        int choice = 0;
        do {
            System.out.println("App Queue");
            System.out.println("1. Order\n2. Process\n3. View");
            System.out.println("4. Exit");
            System.out.print("Choice = ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Buyer's Name: ");
                    String buyer = sc.next();
                    // start loop
                    int beliLagi = 1;
                    do {
                        System.out.println("List of Goods: ");
                        System.out.println("1. Shoes\n2. Slipper");
                        System.out.println("3. Jackets");
                        System.out.print("Choice: ");
                        int choice2 = sc.nextInt();
                        String item = null;
                        if (choice2 == 1) {
                            item = "Shoes";
                        } else if (choice2 == 2) {
                            item = "Slipper";
                        } else if (choice2 == 3) {
                            item = "Jackets";
                        }
                        System.out.print("Price: ");
                        int price = sc.nextInt();
                        System.out.print("Quantity: ");
                        int qty = sc.nextInt();

                        Order ord = new Order(buyer, item, price, qty);
                        Node node = new Node();
                        node.order = ord;
                        queue.enqueue(node);

                        System.out.print("Do you want to buy again? Y = 1/N = 0");
                        beliLagi = sc.nextInt();

                    } while (beliLagi == 1);

                    // end loop
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.view();
                    break;
                case 4:
                    System.out.println("Exiting.. Thanks..");
            }
        } while (choice != 4);
    }

}
