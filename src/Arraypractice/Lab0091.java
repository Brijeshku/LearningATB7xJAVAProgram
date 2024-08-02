package Arraypractice;

public class Lab0091 {
    public static void main(String[] args) {
        int[] salary = {10, 4, 30, 6, 50, 25};

        int max = salary[1];
       // int min=0;
        int min= salary[0];

        for (int i = 0; i < salary.length; i++) {
            // System.out.println(i);
            if (salary[i] > max) {
                max = salary[i];
            }
            if (min>salary[i]){
                min=salary[i];
                System.out.println(min );
            }

        }
        System.out.println(max);
    }



}

