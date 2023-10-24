package homeworkweek7;

import java.util.Scanner;

/**
 *  Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 *  Created by Sandip Patel
 */
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //step 1. Scanner declaration for reading and sc = scanner
        System.out.println("Enter Year"); // step 2. for reader to put value
        int year = sc.nextInt(); // step 3. storing int value
        sc.close(); // scanner close always and sc = scanner

        boolean a = (year % 4) == 0; // is equal and verifies if both operands are equal
        boolean b = (year % 100) != 0; // != is not equal and verify if both are not equal
        boolean c = ((year % 100 == 0) && (year % 400 == 0));
        // for c logic and returns true if both operands are true.
        // returns false if one operand or both operands are false
        // || returns true if one operand or both operands are true Returns and false if both are false
            if(a && (b || c)){
                System.out.println(year + " is a leap Year");

        }else{
                System.out.println(year + "is not a leap Year");
            }

            }
        }
