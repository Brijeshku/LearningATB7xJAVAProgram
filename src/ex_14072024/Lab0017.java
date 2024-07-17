package ex_14072024;

public class Lab0017 {
    public static void main(String[] args) {
        String name1="testing";
        String  name2="testing";
        String name3= new String("testing");
        String name4= new String("testing");
        System.out.println(name1==name2);
        System.out.println(name1==name4);
        System.out.println(name4 ==name4);
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name4));

    }
}
