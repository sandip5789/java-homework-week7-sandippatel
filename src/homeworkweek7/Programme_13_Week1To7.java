package homeworkweek7;

import java.util.Scanner;

/**
 *  Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *    NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 * Created by Sandip Patel
 */

public class Programme_13_Week1To7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare scanner
        System.out.println("Input Number: "); // ask user to put number for read
        int day = sc.nextInt();

        // no need to declare main method as scanner is use
        String dayName = ""; // dayName is variable
       switch(day) {
           case 1:
               System.out.println(dayName = "Monday");
               break;
           case 2:
               System.out.println(dayName = "Tuesday");
               break;
           case 3:
               System.out.println(dayName = "Wednesday");
               break;
           case 4:
               System.out.println(dayName = "Thursday");
               break;
           case 5:
               System.out.println(dayName = "Friday");
               break;
           case 6:
               System.out.println(dayName = "Saturday");
               break;
           case 7:
               System.out.println(dayName = "Sunday");
               break;
           default:
               System.out.println("Invalid week number");
       }
        sc.close(); // scanner close
    }
}
