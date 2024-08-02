package Arraypractice;

public class Lab0093 {
    public static void main(String[] args) {
        int[][] arrays_2d = {
                {20, 30, 40},
                {45, 55, 65},
                {15, 25, 35}
        };
        // R=0,1,2 for i
        //C=0,1,2  for j
        // first we need to find the lengt of both
        for (int i = 0; i <arrays_2d.length ; i++) {
            for (int j = 0; j <arrays_2d[i].length ; j++) {
                System.out.print(arrays_2d[i][j]);
                System.out.print(" ");

            }

            System.out.println();

        }

        }

    }


