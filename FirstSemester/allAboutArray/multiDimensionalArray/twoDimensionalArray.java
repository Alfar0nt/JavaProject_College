package FirstSemester.allAboutArray.multiDimensionalArray;

public class twoDimensionalArray {
    public static void main(String[] args) {
        int[][] arrayGua= {
            {1,3,4},
            {2,3,4},
            {8,9,6}
        };
        for(int i = 0; i < arrayGua.length; i++){
            for (int j=0; j < arrayGua[i].length; j++){
                System.out.println("array " + i + j);
            }
        }
        System.out.println();
    }
}
