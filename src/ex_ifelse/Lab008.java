package ex_ifelse;

public class Lab008 {

        public static void main(String[] args) {
            int year = 2024; // Specify the year to check

            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        public static boolean isLeapYear(int year) {
            // Check if the year is a leap year
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0; // Divisible by 400
                }
                return true; // Divisible by 4 but not by 100
            }
            return false; // Not a leap year
        }
    }


