package homeworkweek7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * Use ternary operator
 * Created by Sandip Patel
 */

public class Programme_1_OddEvenTernaryOpearator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 1. Scanner declaration for reading and sc = scanner
        System.out.println("Enter Number"); //Step 2. for reader to put value
        int number = sc.nextInt(); // step 3. storing input value
        oddOrEvenNumber(number);// call method in main method
        sc.close(); // scanner close always and sc = scanner

    }

    public static void oddOrEvenNumber(int number) {
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd"; // String beacuse is name
        System.out.println(number + " is " + evenOrOdd + "number"); // number is print
    }
}
