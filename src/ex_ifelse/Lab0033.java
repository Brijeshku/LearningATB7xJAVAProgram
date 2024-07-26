package ex_ifelse;

import java.util.Scanner;

public class Lab0033 {
    public static void main(String[] args) {
        // Chec number is positive , negative or zero

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        if (num >0) {
            System.out.println("positive");
        } else if (num<0) {
            System.out.println("negative");

        }else
            System.out.println("zero");

        }
        }


