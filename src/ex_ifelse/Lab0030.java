package ex_ifelse;

import java.util.Scanner;

public class Lab0030 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter vowel");
        char user_input=sc.next().charAt(0);
        System.out.println(user_input);
        switch (user_input){
            case 'a','i','o','u','e':
                System.out.println("vowel");
                break;

            default:
                System.out.println("not vowel");
        }

    }
}
