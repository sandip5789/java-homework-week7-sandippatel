package homeworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * Using switch statement
 * Created by Sandip Patel
 */

public class Programme_9_AtoZCityNameUsingSwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare scanner
        System.out.println("Input any alphabet from A to F(Upper case only): "); // reader print
        char cityname = sc.nextLine().charAt(0); // char because only character & city name is variable
        // The charAt() method returns the character at the specified index in a string
        //The index of the first character is 0, the second character is 1, and so on.
        // 0 is very important other uf you put 1 error comes
        sc.close();// scanner closed sc = scanner
        // using switch statements
        // cityname is variable so instead of String switch apply
        char name= 'A';
        switch (cityname){
            case 'A': // A is variable
                System.out.println("City Name: Ahmedabad");
                break; // The break statement is used to terminate the statement sequence inside the switch.
            case 'B': // B is Variable
                System.out.println("City Name: Baroda");
                break; //The break statement is used to terminate the statement sequence inside the switch.
            case 'C': // C is Variable
                System.out.println("City Name: Chandigarh");
                break; // The break statement is used to terminate the statement sequence inside the switch.
            case 'D': // D is Variable
                System.out.println("City Name: Delhi");
                break; //The break statement is used to terminate the statement sequence inside the switch.
            case 'E': // E is Variable
                System.out.println("City Name: Erod");
                break; // The break statement is used to terminate the statement sequence inside the switch.
            case 'F': // F is Variable
                System.out.println("City Name: Faridabad");
                break; // The break statement is used to terminate the statement sequence inside the switch.
            default:
                //A switch statement can have an optional default case, which must appear at the end of the switch.
                // The default case can be used for performing a task when none of the cases is true.
                // No break is needed in the default case.
                System.out.println("Invalid entry Please enter alphabet between A and F"); // call method
        }
    }
}
