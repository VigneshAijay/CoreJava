package variabletopic;

public class staticvariablewaytousage                    // static block
{                                                        // static method
                                                         // static variable
        int door = 12; // instance variable
        int key = 2; // static variable

    public  static void animals(){
        int  parrot = 1;
        int birds = 23; // local variable
        System.out.println(parrot);
        System.out.println(birds);
    }

    public static void main(String[] args) {

        staticvariablewaytousage Object = new staticvariablewaytousage();
        System.out.println( Object.door);
        System.out.println( Object.key);
        animals();


    }

}
