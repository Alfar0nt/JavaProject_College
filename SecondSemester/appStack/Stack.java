package SecondSemester.appStack;

public class Stack { //berupa linkedlist
    Node top, bottom;
    int jumlah;
    Node temp;
    Stack(){
        top=bottom=null;
        jumlah=0;
    }
    void push(Node baru){
        if(top == null){
            top=bottom=baru;
        }else{
            baru.next=top;
            top=baru;
        }
        jumlah++;
    }
    Node pop(){
        if(top==null){
            System.out.println("ur stack is empty");
        }else if(top.next==null){
            temp=top;
            top=bottom=null;
        }else{
            temp=top;
            top=top.next;
        }
        return temp;

    }
    void show(){
        System.out.print("Stack = ");
        for(Node t=top; t!=null; t=t.next){
            System.out.print("("+t.getTugas()+")");
        }
        System.out.println("");
    }
}
