package looping;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name = Sc.next();
        System.out.println("enter the name" + name);
        String name1 = Sc.nextLine();
        System.out.println("enter the name1" + name1);
        if (name1==name){
            System.out.println("its coorect");
        } else if (name!=name1) {
            System.out.println("its is wrong");

        }
        else {
            System.out.println("names is not matching");
        }
    }
}
