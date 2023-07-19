package ControlStructure;

import java.util.Scanner;

public class conditionclass {
    String name ;
    String words ;
    int keya ;
    float valueb ;

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = Sc.next();
        //System.out.println(name);
        System.out.println("enter the words");
        String words = Sc.next();
        //System.out.println(words);
       // System.out.println("enter the keya  value");
        //int keya = Sc.nextInt();
        //System.out.println(keya);
       // System.out.println("enter the  value b");
         //int valueb = Sc.nextInt();
        //System.out.println(valueb);

        if (name.equals(words)){
            System.out.println("name is equal words");
        }
        else if (name!= words) {
            System.out.println("name not equal words");
        }

        else {
            System.out.println("condition is not matched");
        }
    }
}
