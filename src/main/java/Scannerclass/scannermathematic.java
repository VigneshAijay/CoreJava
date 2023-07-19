package Scannerclass;

import java.util.Scanner;

public class scannermathematic {

    // int addtion;
    // int subraction;
    // int multiplication;
    // int division ;
    // int modules ;

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the addion value");
        System.out.println(" enter the a value");
        int  a = Sc.nextInt();
        System.out.println(" enter the b value");
        int b = Sc.nextInt();
        int c = a+b;
        System.out.println(c);
        System.out.println("enter the subraction value");
        System.out.println("enter the x value");
        int x = Sc.nextInt();
        System.out.println("enter the y value");
        int y = Sc.nextInt();
        int z = x-y;
        System.out.println(z);
        System.out.println(" enter the multiplication");
        System.out.println(" enter the multiple a1 value ");
        int a1 = Sc.nextInt();
        System.out.println("enter the multiple b1 value");
        int b1 = Sc.nextInt();
        int c1 = (a1 * b1);
        System.out.println(c1);
    }

}
