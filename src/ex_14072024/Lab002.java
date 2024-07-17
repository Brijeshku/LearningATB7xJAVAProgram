package ex_14072024;

public class Lab002 {
    public static void main(String[] args) {
        byte a=30;
        byte b=40;
        byte c=20;
        //byte d= a+b+c;  //  byte and byte -> result should be int > need to consider greater one
        // here need to remember table for data types
        int d=a+b+c;
        System.out.println(d);
        char a1= 'A';
        char b1='B';
        int c1=a1+b1;
        System.out.println(c1);
        char s= 'A';
        char y= 'B';
        int t= s+y;

        System.out.println(t);
        System.out.println('A'==65);
        System.out.println('B'==66);

        char x='A';
        short s1 =10;
        int ss= x+s1;
        System.out.println(ss);



    }
}
