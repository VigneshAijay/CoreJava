package ControlStructure;

import java.util.Scanner;

public class conditionpostivenegative {
    public static void main(String[] args) {
        Scanner Ss = new Scanner(System.in);
        System.out.println("enter the number");
        int pos = Ss.nextInt();
        if (pos<0){
            System.out.println("negative value");
        }
        else if(pos>0){
            System.out.println("positive value");
        }


    }






}
