package Arraypractice;

import java.util.Scanner;

public class Lab0070 {
    public static void main(String[] args) {
        int [] marks=new int[3];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc= new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=60;
        marks[2]=70;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        boolean[] is_married={true,false,true};
        for (int i = 0; i <marks.length ; i++) {
            System.out.println(i);
            System.out.println(marks[i]);
            System.out.println(i+" ->" +marks[i]);

        }

    }
}
