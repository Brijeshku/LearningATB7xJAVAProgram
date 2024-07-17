package ex_14072024;

public class Lab0018 {
    public static void main(String[] args) {
        String name1 = new String("Brijesh"); //total 3 strings are created
        String name2=  new String("Brijesh");
        String name3 =  new String("Brijesh");
        System.out.println(name1==name3);
        System.out.println(name1==name2);
        System.out.println(name2.equals(name1));
        System.out.println(name2.equals(name3));

    }
}
