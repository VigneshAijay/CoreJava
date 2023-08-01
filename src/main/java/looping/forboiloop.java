package looping;

import java.util.Scanner;

public class forboiloop {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the value");
        float key = Sc.nextFloat();
        while (key>1){
            System.out.println("enter the key" + key);
            key++;

        }
    }
}
