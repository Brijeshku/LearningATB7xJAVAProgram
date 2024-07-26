package ex_forloop;

import java.util.concurrent.CountDownLatch;

public class Lab0058 {
    public static void main(String[] args) {
        int i,j,count;
        System.out.println("1-100:");
        for (i = 2; i <=100 ; i++) {
            count=0;
            for (j = i; j >=1 ; j--) {
                if(i%j==0)
                count = count + 1;
            }
            if (count==2)
                System.out.println(" " + i + " ");
                
            }

            }
        }


