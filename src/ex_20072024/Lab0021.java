package ex_20072024;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab0021 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");

        int num1=sc.nextInt();
        System.out.println("enter num 2");
        int num2 =sc.nextInt();

      if(num1>num2) {
          System.out.println(num1);
      } else if (num1<num2) {
          System.out.println(num2);
      }else {
          System.out.println("equal");
          
      }
    }
    }
