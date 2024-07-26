package ex_forloop;

import java.util.Scanner;

public class Lab0062 {
    public static void main(String[] args) {
        // coding
        // fatcorial
        // n=1*2*3*4*5
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter number fact,Print fact");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
        //fact=fact*i;


        sc.close();
    }
}
