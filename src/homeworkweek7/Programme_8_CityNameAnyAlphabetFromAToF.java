package homeworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * Created by Sandip Patel
 */

public class Programme_8_CityNameAnyAlphabetFromAToF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare scanner
        System.out.println("Input any alphabet from A to F(Upper case only): "); // reader print
        char cityname = sc.nextLine().charAt(0); // char because only character and cityname is variable
        // The charAt() method returns the character at the specified index in a string
        //The index of the first character is 0, the second character is 1, and so on.
        // 0 is very important other uf you put 1 error comes
        sc.close(); // scanner closed sc= scanner

        String city;
        // String city and input all city name and alphabets

            if (cityname == 'A') { // == is checks whether its two operands are equal, returning a Boolean result
                city = "Ahmedabad";
            } else if (cityname == 'B') { // == is checks whether its two operands are equal, returning a Boolean result
                city = "Baroda";
            } else if (cityname == 'C') { // == is checks whether its two operands are equal, returning a Boolean result
                city = "Chandigarh";
            } else if (cityname== 'D') { // == is checks whether its two operands are equal, returning a Boolean result
                city = "Delhi";
            } else if (cityname == 'E') { // == is checks whether its two operands are equal, returning a Boolean result
                city = "Erod";
            } else if (cityname== 'F') { // == is checks whether its two operands are equal, returning a Boolean result
                city = "Faridabad";
            } else {                       // else because if all condition not apply then Invalid entry
                city = "Invalid entry Please enter alphabet between A and F  ";
            }

            System.out.println("City Name: " + city); //  call city name

        }
    }

