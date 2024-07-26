package ex_forloop;

import java.util.Scanner;

import static javax.swing.text.html.HTML.Attribute.N;

public class Lab0049 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
               int N= sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(N+ "x"+i+"="+N*i);
            
        }
  sc.close();


            
        }
        
    }

