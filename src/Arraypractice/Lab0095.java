package Arraypractice;

public class Lab0095 {
    public static void main(String[] args) {
        int[][] arrays= {
                {1, 2, 3},
                {6,7,8}

        }  ;
        int row= arrays.length;
        for (int i = 0; i < arrays.length ; i++) {
            for (int j = 0; j<arrays[i].length ; j++) {
               // System.out.println(arrays[i][j]);
                System.out.println(arrays[j][i]);

            }

        }
    }
}
