package ControlStructure;

import java.util.Scanner;

public class postivenegative {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = Sc.nextInt();
        if (a<0){
            System.out.println("enter the negative number");
        } else if (a>0) {
            System.out.println("enter the postive number");

        }
        else {
            System.out.println("number are not matching");
        }
    }

}
