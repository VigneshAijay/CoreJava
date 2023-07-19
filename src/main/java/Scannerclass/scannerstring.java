package Scannerclass;

import javax.net.ssl.SSLEngine;
import java.util.Scanner;

public class scannerstring {
    public static void main(String[] args) {
        Scanner SS = new Scanner(System.in);
        System.out.println("enter the name");
        System.out.println("enter the name 1");
        String name1 = SS.next();
        System.out.println("enter the name 2");
        String name2 =SS.next();
        boolean name = ((name1.equals(name2)));

         System.out.println(name);
    }
}
