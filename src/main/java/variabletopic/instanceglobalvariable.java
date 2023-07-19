package variabletopic;

public class instanceglobalvariable // -- the varibale is occur in down side of classname
                                     // and outside of method name that is instance global variable
{
    String name = "vignesh";
    int peacock = 1;

    public static void main(String[] args) {
        instanceglobalvariable Object = new instanceglobalvariable();

        System.out.println(Object.name);
        System.out.println(Object.peacock);
    }

}
