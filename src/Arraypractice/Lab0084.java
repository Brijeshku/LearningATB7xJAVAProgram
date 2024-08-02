package Arraypractice;

import java.util.Scanner;

public class Lab0084 {
    public static void main(String[] args) {

        int []  marks=new int[4];
        // index= 0,1,2,3
//        //len-4
//
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
        Scanner sc= new Scanner(System.in);
        marks[0] =sc.nextInt();
        //marks[0]=55;
        marks[1]=60;
        marks[3]=70;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
       // System.out.println(marks[2]);
        System.out.println(marks[3]);

    }
}
