package Arraypractice;

import java.util.Scanner;

public class Lab0090 {
    public static void main(String[] args) {

        // input 5 subject marks with avg
        Scanner sc =new Scanner(System.in);

        float[] Marks=new float[5];
        for (int i = 0; i < Marks.length; i++) {
            System.out.println("enter the marks of subject"+(i+1));
            Marks[i]= sc.nextFloat();
            
        }
        for (int i = 0; i <Marks.length ; i++) {
            System.out.println("Marks of sub" +(i+1)+":"+Marks[i]);

        }
//        System.out.println(" enter the marks of subject 1");
//        Marks[0]= sc.nextFloat();
//        System.out.println("enter the marks of subject 2");
//        Marks[1]= sc.nextFloat();
//        System.out.println("enter the marks of subject 3");
//        Marks[2]= sc.nextFloat();
//        System.out.println("enter the marks of subject 4");
//        Marks[3]= sc.nextFloat();
//        System.out.println("enter the marks of subject 5");
//        Marks[4]= sc.nextFloat();
        float avg=(Marks[0]+Marks[1]+Marks[2]+Marks[3]+Marks[4])/5;
        System.out.println("avg is->"+avg);





    }
}
