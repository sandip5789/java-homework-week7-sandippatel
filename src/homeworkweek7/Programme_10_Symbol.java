package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 * created by Sandip Patel
 */

public class Programme_10_Symbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare scanner
        System.out.println("Enter the First Number"); //  ask user to insert first number
        double num1 = sc.nextDouble(); // nmu1 double because decimal number and nextDouble always same as datatype
        System.out.println("Enter the Second Number"); // ask user to insert second number
        double num2 = sc.nextDouble(); // num2 double because decimal number and nextDouble always same as datatype
        System.out.println("Enter the Symbol +,-,*,/"); // ask user to enter symbol
        char symbol = sc.next().charAt(0);// char because of symbols
        // The charAt() method returns the character at the specified index in a string
        //The index of the first character is 0, the second character is 1, and so on.
        // 0 is very important other uf you put 1 error comes

        // result is variable
        double result; // declare variable
        if(symbol == '+')// + symbol to get addition
        {
            result = num1 + num2;
            System.out.println("Answer: " + result); // print to get answer
        } else if (symbol == '-')// - symbol to get subtraction
        {
            result = num1 - num2;
            System.out.println("Answer: " + result);
        }else if (symbol == '*')//  * symbol to get multiplication
        {
            result = num1 * num2;
            System.out.println("Answer: " + result);
        }else if (symbol == '/') //  / symbol to get division

        if (num2 == 0)

    {

        System.out.println("Error: Zero is not allowed");
    }else

    {
        result = num1 / num2;
        System.out.println("Answer: " + result);
    }
    else{

    {
        System.out.println("Invalid symbol. Enter +, -, *, / only");
    }
      sc.close();  //scanner close
    }












        sc.close(); // scanner closed sc= scanner
    }
}
