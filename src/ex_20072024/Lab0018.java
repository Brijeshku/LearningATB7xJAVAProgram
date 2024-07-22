package ex_20072024;

import java.util.Scanner;

public class Lab0018 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number1");
        int user_input= sc.nextInt();


        System.out.println(user_input);


        if(user_input %2==0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
