package ex_ifelse;

import java.util.Scanner;

public class Lab0020 {
    public static void main(String[] args) {
        // if max 2 numbers are equal
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= sc.nextInt();
        System.out.println("enter number2 ");
        int num2 =sc.nextInt();
        if (num1==num2) {
            System.out.println(num1);
        }else {
            System.out.println(num2);

        }
    }
}
