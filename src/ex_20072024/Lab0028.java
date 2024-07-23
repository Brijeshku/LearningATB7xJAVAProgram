package ex_20072024;

import java.util.Scanner;

public class Lab0028 {
    public static void main(String[] args) {
        // for Switch -> if we have 2+conditions
        // day between 1-7
        // if day is 3
        Scanner sc=new Scanner(System.in);
        System.out.println("enter day 1-7 , tell you the day it is");
        int day= sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("no idea what day it is");
        }
        System.out.println("------Out side the loop----");
    }
}
