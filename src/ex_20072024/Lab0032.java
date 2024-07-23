package ex_20072024;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab0032 {
    public static void main(String[] args) {
        // write a program for name,age, salary and print
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name");
        String name= sc.next();
        System.out.println("enter your age");
        int age= sc.nextInt();
        System.out.println("enter your salary");
        double salary=sc.nextDouble();
        System.out.println("your name->"+ name);
        System.out.println("your age->"+age);
        System.out.println("your salary->"+salary);
        sc.close();

    }
}
