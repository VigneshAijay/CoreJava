package looping;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = Sc.nextInt();
        System.out.println(a);
        for (a= 0;a<10; a++){        // a>10;
            System.out.println(a);
        }
    }
}
