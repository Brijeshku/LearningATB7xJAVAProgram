package Oops;

public class Acccount {
    String name;
    int balance;

    void balance(){

    }
    void withdraw(){

    }

    public static void main(String[] args) {
        Acccount acccount=new Acccount();
        Acccount acccount1=new Acccount();

        acccount.name="ICIC";
        acccount1.name="SBI";
        System.out.println(acccount.name);
        System.out.println(acccount1.name);

    }
}
