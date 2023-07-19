package typecasting;

public class typecastingclass //  type casting is
                             // when you assign one datatype covert into another data types

{
    public static void main(String[] args) {
        int a = 10;
        float b = (float) a; // widendingtypecasting
        System.out.println(b);

        double x = 12345;
        int y = (int)x;   // narrowing typecasting
        System.out.println(y);

    }

}
