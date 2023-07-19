package ControlStructure;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("please tell maths mark");
        int mathsmark=ss.nextInt();
        if(mathsmark>=50)
        {
            System.out.println("You are selected Enginneering courses");
            Scanner ss1 = new Scanner(System.in);
            System.out.println("please tell us biology Marks");
            int biologymark= ss1.nextInt();
            if(mathsmark>=50 && biologymark>=65)
            {
                System.out.println("You are selected medical fields");
            }
            else {
                System.out.println("You are not Eligible for medical field");
            }
        }
        else {
            System.out.println("Not Eligible for Any courses");
        }

    }
}
