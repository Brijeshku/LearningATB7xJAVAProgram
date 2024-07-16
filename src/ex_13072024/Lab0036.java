package ex_13072024;

public class Lab0036 {
    public static void main(String[] args) {
        int a= 10;
        boolean b=!(a>5||a<5);
        System.out.println(b);
        boolean c= !!(a>=30 || a<=15);
        System.out.println(c);
        boolean d= !!!(a==10 || a!=10);
        System.out.println(d);
    }
}
