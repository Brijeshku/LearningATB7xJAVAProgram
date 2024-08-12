package Oops;

public class Bank2 {
    String name="ICICI";
    int accNo=1112222;

    void checkbalance(){

    }
    void withdraw(){

    }
    void tranfer(){

    }

    public static void main(String[] args) {
        Bank2 bank2=new Bank2();
        System.out.println(bank2.name);
        System.out.println(bank2.accNo);
        Bank2 bank3=new Bank2();
        bank3.name="SBI";
        System.out.println(bank3.name);
    }
}
