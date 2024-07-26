package ex_ifelse;

import java.util.Scanner;

public class Lab0023 {
    public static void main(String[] args) {
        // grade cal program
        // A:90-10
        // B:81-90
        // C:71-80
        // D:60-70
        // E:0-59
        // user input data type int
        // return char
        // we will use scanner class
        // basic logic part
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the students score");
        int score= sc.nextInt();
        if (score>=90 && score<=100) {
            System.out.println("A");
        }
        if (score>=80 && score<=90) {
            System.out.println("B");
        }if (score >= 70 && score<=80) {
            System.out.println("C");
        }if (score>=60 && score<=70) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }

    }
}
