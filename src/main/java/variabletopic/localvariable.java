package variabletopic;

public class localvariable   //--- the variable is occur inside the method that is called local variable

{
public  static void animals (){
    int tiger = 1;
    int lion = 2;
    System.out.println("tiger having\t" + tiger);
    System.out.println("lion having \t" + lion);
}

    public static void main(String[] args) {
        animals();
    }

}
