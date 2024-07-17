package ex_14072024;

public record Lab0012() {
    public static void main(String[] args) {
        String name= new String("New name");
        String name1= new String("New name2");
        String name2=new String("New_name3");
        System.out.println(name.length());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name2.toLowerCase());
        System.out.println(name2.getBytes());
        System.out.println(name2.length());
        System.out.println(name1.charAt(2));
        System.out.println(name.charAt(6));
    }
}
