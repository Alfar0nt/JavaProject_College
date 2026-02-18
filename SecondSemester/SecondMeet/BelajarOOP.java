package SecondSemester.SecondMeet;
import java.util.Scanner;

class Student{
    // ini adalah data
    String NPM;
    String Name;
    Double IPK;

    // ini adalah method/function
    void isidata(){ // versi user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NPM: ");
        NPM = sc.next();
        System.out.print("Masukkan Nama: ");
        Name = sc.next();
        System.out.print("Masukkan IPK: ");
        IPK = sc.nextDouble();
        sc.close();
    }
    void isiData(String npm, String nm, Double ip){ //versi udah ada
        NPM = npm; Name = nm; IPK = ip;
    }
    void cetakData(){
        System.out.println("Data Mahasigma");
        System.out.println("NPM: "+NPM);
        System.out.println("Nama Mahasigma: "+Name);
        System.out.println("IPK: "+IPK);
    }

}

public class BelajarOOP {
    public static void main(String[] args) {
        Student mhs = new Student();
        System.out.println("=== Data Mahasigma (non user input) ===");
        mhs.isiData("042", "Dhiar", 4.00);
        mhs.cetakData();
        
        System.out.println("=== Data Mahasigma (user input) ===");
        mhs.isidata();
        System.out.println("=== Data Sudah Tersimpan ===");
        mhs.cetakData();
    }

}
