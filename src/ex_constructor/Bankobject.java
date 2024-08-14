package ex_constructor;

import java.util.Scanner;

public class Bankobject {
    public static void main(String[] args) {

        //DC
        //Bank b1=new Bank();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bname");
        String bname= sc.next();
        System.out.println("Enter balance");
        long balance=sc.nextLong();
        System.out.println("enter bank code");
        String Bankcode=sc.next();



//        //b1.name="ICIC";
//        System.out.println(b1.name);
//        //b1.balance=555;
//        System.out.println(b1.balance);
//        System.out.println(b1.bankCode);
//        b1.printDetails();

        //PC
        Bank icici= new Bank(bname,balance,Bankcode);
//        System.out.println(icici.name);
//        System.out.println(icici.balance);
//        System.out.println(icici.bankCode);
          icici.printDetails();
        sc.close();

    }



}
