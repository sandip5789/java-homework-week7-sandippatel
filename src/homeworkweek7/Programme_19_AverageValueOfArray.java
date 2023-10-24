package homeworkweek7;

import java.util.Arrays;

/**
 *  Write a Java program to calculate the average value of array elements.
 *  Created by Sandip Patel
 */

public class Programme_19_AverageValueOfArray {
    public static void main(String[] args) {
        double[] num = {1.8, 2.5, 3.45, 4.21, 50.15, 60, 71, 89}; // num is variables
        // stream = retrieves a stream of data of a specified type from an array
        Double avg = Arrays.stream(num).average().orElse(0); // sum is variable
        System.out.println(avg); // print answer
    }
}

