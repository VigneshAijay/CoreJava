package ControlStructure;

import java.util.Scanner;

public class loopingvbn {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the value");
        int a = Sc.nextInt();
        while (a>8){
            System.out.println("its is correct value");
            a++;
            break;
        }
        if (a<4){
            System.out.println("its is matching");
        } else if (a>6) {
            System.out.println("its not matching");

        }
        else {
            System.out.println("not matching");
        }
    }
}
