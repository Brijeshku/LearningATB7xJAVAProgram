package ex_constructor;

public class Localvariable {
    int age=125;// instance variable
    // no concept in java for global variable

    void f1() {
        int e=45;// Instance variable// In java there is no global variable
        System.out.println(age);  // Local variable-> within the function
    }
    void f2(){
        int e=60;
      //  System.out.println(e);
    }

    public static void main(String[] args) {

    }
}
