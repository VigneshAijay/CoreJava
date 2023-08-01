package ControlStructure;

import java.util.Scanner;

public class twovalue {
    public static void main(String[] args) {
        Scanner Ss = new Scanner(System.in);
        System.out.println("enter two values");
        int a = 4;
        int b = 8;
        if (a<b){
            System.out.println(false);
            if (a>b){
                System.out.println(true);
            }
        }
        else {
            System.out.println("two values or not matching");
        }
    }
}
