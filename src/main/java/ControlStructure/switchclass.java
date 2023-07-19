package ControlStructure;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class switchclass
{

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the day");
        String day = Sc.next();
        switch (day) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":

                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("Sunday");
                break;
            case "Bucket":
                System.out.println("Buckets in house thing important");
                break;
            case "Chair":
                System.out.println("chair in houses thing important");
                break;
            case "table fan":
                System.out.println("table fan in house thing important");
                break;
            default:
                System.out.println("things are not matching");
        }

    }

}
