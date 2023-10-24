package homeworkweek7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 * created by Sandip Patel
 */

public class Programme_12_NumberAlphabetSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare scanner
        System.out.println("Enter a character"); // ask user to input number, alphabet or symbol
        char answer = sc.next().charAt(0); // call method
        // The charAt() method returns the character at the specified index in a string.
        // The index of the first character is 0, the second character is 1, and so on.
        sc.close(); // scanner close
        //The isDigit() function is an inbuilt method of Java.
        //The isDigit() function is used to check whether the given character is a digit or not.
        //The isDigit() function takes a character or codepoint value which is to be checked for a digit.
        // The isDigit() function returns a boolean value

        if (Character.isDigit(answer)) { // Character.is.Digit is method in java and answer is variable
            System.out.println("Answer is a number.");
        } else if (Character.isLetter(answer)) { // answer is variable and Character.isLetter is method in java
            System.out.println("Answer is an alphabet. ");

            }else {
                System.out.println("Answer is a symbol");

            }
        }
    }
