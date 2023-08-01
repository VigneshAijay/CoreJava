package ControlStructure;

import java.util.Scanner;

public class scannerlooping {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the value");
        int key =Sc.nextInt();
        while (key>5){
            System.out.println(key);
        }
    }
}
