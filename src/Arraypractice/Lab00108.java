package Arraypractice;

public class Lab00108 {
    public static void main(String[] args) {


        String s = "MIRZAPUR";
        s = "KACHHAWA";

        StringBuffer stringBuffer=new StringBuffer("MIRZAPUR");
        stringBuffer.append("KACHHAWA");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.charAt(2));
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.indexOf("W"));
    }
}