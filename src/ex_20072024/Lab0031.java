package ex_20072024;

public class Lab0031 {
    public static void main(String[] args) {
        int itemcode=01;
        switch (itemcode){
            case 001,002,003:
                System.out.println("electronic");
                break;
            case 005,004,006:
                System.out.println("not gagts");
            default:
                System.out.println("none");
        }

    }
}
