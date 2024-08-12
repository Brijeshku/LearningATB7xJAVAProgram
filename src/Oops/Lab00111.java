package Oops;

public class Lab00111 {
    public static void main(String[] args) {
        Bank bank1=new Bank();
        Bank bank2=new Bank();
        bank1.Name="SBI";
        bank2.Name="ICIC";
        System.out.println(bank1.Name);
        System.out.println(bank2.Name);

        bank2.balance=100;


        System.out.println(bank2.balance);
        bank1.balance=200;
        System.out.println(bank1.balance);

    }
}
