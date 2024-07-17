package ex_14072024;

public class Lab0020 {
    public static void main(String[] args) {
        String s= "Brijesh@1233";
        String pass_u = s.toLowerCase();
        System.out.println(pass_u);
        System.out.println(pass_u==s);
        System.out.println(pass_u.equals(s));
        System.out.println(pass_u.compareToIgnoreCase(s));
        System.out.println(pass_u.equalsIgnoreCase(s));
        System.out.println(s.substring(0,5));
        System.out.println(s.indexOf('r'));
        System.out.println(s.indexOf('i'));



        }
}
