package ex_20072024;

import java.util.Scanner;

public class Lab0029 {
    public static void main(String[] args) {
        // browser running case
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name where you want execute ");
        String browser= sc.next();
        browser=browser.toLowerCase();
        switch (browser){
            case "Chrome":
                System.out.println("Starting the chrome");
                break;
            case "fireFox":
                System.out.println("Starting the firefox");
            case "edge":
                    System.out.println("Starting the edge");
            default:
                System.out.println("no idea");
        }
        System.out.println(" any browser");
    }
}
