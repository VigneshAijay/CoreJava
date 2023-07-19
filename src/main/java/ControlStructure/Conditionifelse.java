package ControlStructure;


import java.util.Scanner;

public class Conditionifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value");
        int a = sc.nextInt();
        System.out.println("Enter the b value");
        int b = sc.nextInt();
        System.out.println("enter the name1");
        String name1 = sc.next();
        System.out.println("enter the name2");
        String name2 = sc.next();
        if(a<b){
            System.out.println("A is less than b");
        }

        else if(a>b){
            System.out.println("A is greater than b");

        }
        else{
            System.out.println("Condition is not matched");

        }
         if (name1==name2){
             System.out.println("name1equal to equal name2");

        }
         else if(name1!=name2) {
             System.out.println(name1!=name2);

         }
         else {
             System.out.println("name1 and name2 is not matching");
         }
    }
}
