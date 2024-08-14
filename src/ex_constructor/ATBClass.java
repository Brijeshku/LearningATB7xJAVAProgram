package ex_constructor;

public class ATBClass {

    String name;
    long phone;
    int age;

    ATBClass() {
        System.out.println("Create an object");
    }

    ATBClass(String nameGiven) {
        this.name = nameGiven;

    }

    ATBClass(String nameGiven, long phone) {
        this.name = nameGiven;
        this.phone=phone;

    }
    ATBClass(String nameGiven,long phone,int age){
        this.name="nameGiven";
        this.phone=phone;
        this.age=45;

    }
}

