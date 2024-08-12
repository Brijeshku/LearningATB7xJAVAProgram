package Arraypractice;

public class Lab0098 {
    public static void main(String[] args) {

        //triangle classifier print for 10 rows
        int rows=10;
        for (int i = 1; i <=rows ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}

