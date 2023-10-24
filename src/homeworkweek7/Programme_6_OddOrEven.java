package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 * created by Sandip Patel
 */

public class Programme_6_OddOrEven {
    public static void main(String[] args) {
        // use if and else method
        Scanner sc = new Scanner(System.in); // declare scanner
        System.out.println("Insert a number"); // for reader to insert number
        int number = sc.nextInt();
        sc.close(); // scanner close always and sc = scanner
        if (number%2 == 0) { // % remainder number%2 == 0
            System.out.println(number + " is even number"); // print even number
        }else{
            System.out.println(number + " is odd number");// print odd number

        }
    }
}
