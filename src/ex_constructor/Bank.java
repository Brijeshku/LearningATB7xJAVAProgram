package ex_constructor;

public class Bank{

    String name;
    long balance;
    String bankCode;
    //DC

    Bank() {
        name = "SBI";
        bankCode = "SBI001";
        balance = 555555;
    }

        //PC
        Bank(String bname,long balance, String bankCode){
        this.name=bname;
        this.balance=balance;
        this.bankCode=bankCode;

    }

    void printDetails(){
        System.out.println("Bankname->" +name);
        System.out.println("bal->"+balance);
        System.out.println("Code->"+bankCode);
    }

}
