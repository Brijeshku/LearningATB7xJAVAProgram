package ex_14072024;

public class Lab008 {
    public static void main(String[] args) {
        int a=10;
       // System.out.println(++a +a++ +a++);
        //a=++a->    exp pre= 11   a=11
        //+
        //b=a++      exp post=11   a=12
        //+
         //c=a++     exp=12        a=13
        System.out.println(a++ + ++a + ++a);


        //a=a++    exp= 10     |  a=11
        //+
        //b=++a    exp=12       a=12
        //c=++a    exp=13        a=13


    }
}
