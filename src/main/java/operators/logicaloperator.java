package operators;

public class logicaloperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a>5 && a>10);    // two correct true || any one true -- false
        System.out.println(a>3||a<8);       // two correct true || any one true --- true || any one false  --- true
        System.out.println(! (a<2&&a>6));   // return the result
    }
}
