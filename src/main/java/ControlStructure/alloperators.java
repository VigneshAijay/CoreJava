package ControlStructure;

public class alloperators {
    public static void main(String[] args) {
        int a = 45;
        int b = 456;
        int c = a+b;
        System.out.println(c);

        int x =345;
        x*=3456;
        System.out.println(x);

        int key = 78;
        int keys = 345;
        System.out.println(key==keys);
        System.out.println(key!=keys);


        int word = 34;
        int numbers = 45;
        System.out.println(word&numbers);
        System.out.println(word|numbers);

        int a1 = 3;
        int b1 = 3;
        System.out.println(a1|b1);

        int pen = 222;
        int eraser = 2;
        System.out.println(++pen);
        System.out.println(--eraser);

        int pencil = 3;
        int ink = 1;
        int thinks = pencil<<ink;
        System.out.println(thinks);
         int  words = pencil>>ink;
        System.out.println(words);

    }
}
