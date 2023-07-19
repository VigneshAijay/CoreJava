package ControlStructure;

import java.util.Scanner;

public class switchclass2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("which group are you taking");
        String groups = Sc.next();
        switch (groups){
            case "mathsgroup":
                System.out.println("your are slected maths group");
                break;
            case "bilogygroup":
                System.out.println("your  are selected biologygroup ");
                break;
            default:

                System.out.println("your are not selecte any groups");

    }


}}
