package ex_constructor;

public class ATBobject {

    public static void main(String[] args) {
//        ATBClass p1=new ATBClass("tony");
//        ATBClass p2=new ATBClass("Amit");
//        ATBClass p3=new ATBClass("Temp");
        ATBClass p1=new ATBClass("logic",1233);
        ATBClass p5=new ATBClass("New",998555552,45);

       // p1.name="tony";
       System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p5.name);
        System.out.println(p5.phone);
        System.out.println(p5.age);
        //System.out.println(p5);
//        System.out.println(p2.name);
//        System.out.println(p3.name);
//        p1.name="kumar";
//        System.out.println(p1.name);
//        ATBClass p2=new ATBClass();
    }
}
