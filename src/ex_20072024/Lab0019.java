package ex_20072024;

import java.util.Scanner;

public class Lab0019 {

    // Max number in two inputs
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("enter nuumber 2");
        int num2=sc.nextInt();
        //System.out.println(Math.max(num1,num2));
        if (num1>num2) {
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }

    }
}
