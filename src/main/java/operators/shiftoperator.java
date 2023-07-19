package operators;

public class shiftoperator
 {                                  // formula
                                    // right shift = a/2(b)
                                    // left shift = a* 2(b)
     public static void main(String[] args)
     {
         int x = 8;
         int y = 4;
         int z;
         z = x>>y;
         System.out.println(z);
         z = x<<y;
         System.out.println(z);


     }


}
