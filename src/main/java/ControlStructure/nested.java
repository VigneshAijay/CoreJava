package ControlStructure;

import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("group");
        String group = ss.nextLine();
        System.out.println(group);
        String mathsgroup= ss.next();
        if (mathsgroup=="bilogygroup") {
            System.out.println("you are select the maths group");
        }
    }
}
