package FirstSemester.allAboutArray.oneDimensionalArray;

public class Pertemuan9 {
        public static void main(String[] args) throws Exception {
            int[] arrayGua = {10, 20, 30};
           // System.out.println(arrayGua[1]);
           int i = 5;
           if (i < arrayGua[1]){
            do {i++; System.out.println(i);
              }
            while (i < arrayGua[1]);
             
          }
            else {System.out.println("lebih dari 20");
         }

         for (int a = 0; a < arrayGua[1];  a++) {
          System.out.println("array anda adalah: " + a);
         }
         System.out.println("setelah perubahan");

         arrayGua[1] = 30;
         for (int a = 0; a < arrayGua[1]; a++) {
          System.out.println("array anda adalah: " + a);
         }
    }
}
