package Arraypractice;

import static java.lang.Integer.reverse;

public class Lab00100 {
    public static void main(String[] args) {

        int number = 120;
        String reversed = reverseNumber(number);
        System.out.println(reversed);
    }

   public static String reverseNumber(int num) {
        StringBuilder sb = new StringBuilder();
       sb.append(num);
      return sb.reverse().toString();
 }
}





