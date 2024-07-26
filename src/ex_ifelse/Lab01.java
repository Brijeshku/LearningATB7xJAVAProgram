package ex_ifelse;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Score");

        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade C");
        } else {
            System.out.println("fail");
            sc.close();
        }

    }
}

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the Score");
//        int score = sc.nextInt();
//
//        if (score >= 90 && score <= 100) {
//            System.out.println("Grade A");
//        } else if (score >= 80 && score <= 89) {
//            System.out.println("Grade B");
//        } else if (score >= 70 && score <= 79) {
//            System.out.println("Grade C");
////        } else if (score >= 60 && score <= 69) {
////            System.out.println("Grade D");
////        } else if (score >= 0 && score <= 59) {
//            System.out.println("FAIL");
//        } else {
//            System.out.println("Invalid score, please enter a score between 0 and 100.");
//        }
//
//        sc.close();
//    }
//}



