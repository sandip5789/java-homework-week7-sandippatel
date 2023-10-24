package homeworkweek7;

import java.util.Arrays;

/**
 *  Write a Java program to sum values of an array.
 *  Created by Sandip Patel
 */
public class Programme_18_SumValuesOfAnArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8 }; // num is variables
        // stream = retrieves a stream of data of a specified type from an array
        int sum = Arrays.stream(num).sum(); // sum is variable
        System.out.println(sum); // print answer
    }

}
