package looping;

import java.util.Scanner;

public class dowhiles3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the birds name");
         String birds = Sc.next();
        System.out.println(birds);
         int bird = 1;
         do {
             System.out.println(bird);
         }while (bird<=15);
    }
}
