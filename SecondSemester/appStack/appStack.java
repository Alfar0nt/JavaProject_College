package SecondSemester.appStack;
import java.util.Scanner;
public class appStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node node;
        Stack stack = new Stack();
        int choice=0;
        do {
            System.out.println("Stack");
            System.out.println("1. Push\n2. Pop\n3. Show\n4. Exit");
            System.out.print("Choice: ");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Task To Do = ");
                    String task=sc.next();
                    node = new Node();
                    node.setTugas(task);
                    stack.push(node);
                    break;
                case 2:
                    node = stack.pop();
                    if(node!=null)
                        System.out.println(node.getTugas()+ " Done"); 
                    else
                        System.out.println("No task left");
                    System.out.println(node.getTugas()+" Done");
                    break;
                case 3:
                    stack.show();
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    break;
            }
        }while (choice!=4);
    }
}
