package ex_ifelse;

import java.util.Scanner;

public class Lab0034 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("number 1");
        int num= sc.nextInt();
        System.out.println("number 2");
        int num2= sc.nextInt();
        System.out.println("enter number3");
        int num3= sc.nextInt();
        if(num>num2 && num> num3) {
            System.out.println(num);
        } else
            System.out.println(num3);

        }
    }


