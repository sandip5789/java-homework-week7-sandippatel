package homeworkweek7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
 * Created by Sandip Patel
 */

public class Programme_16_PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare scanner
        System.out.println("Enter a number: "); // ask user to put number
        int num = sc.nextInt();// method by scanner
        // use if and else method
        if (num > 0){ // numner is greater then 0
            System.out.println("Number is Positive");
        }else if (num < 0) // number is less then 0
        {
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is Zero");
        }
        sc.close(); // scanner close
    }
}
