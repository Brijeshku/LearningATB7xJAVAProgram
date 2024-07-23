package ex_20072024;

import java.util.Scanner;

public class Lab0022 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        if (age>10) {
            System.out.println("your going to goa");
        }
        else {
            System.out.println("you are going to goa and maldives");
        }
    }
}
