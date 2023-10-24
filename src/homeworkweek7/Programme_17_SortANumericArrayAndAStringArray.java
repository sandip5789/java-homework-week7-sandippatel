package homeworkweek7;
/**
 * Write a Java program to sort a numeric array and a string array.
 * Created by Sandip Patel
 */
import java.util.Arrays;

public class Programme_17_SortANumericArrayAndAStringArray {
    public static void main(String[] args) {
        int[] num = {5, 2, 6, 1, 3, 4}; //  num = numeric array variables
        String[] str ={"Virat", "Rohit", "Sachin", "Hardik", "Dhoni", "Kapil"}; // str = string or name variables
        Arrays.toString(num); // toString is method and num is variable
        Arrays.toString(str);// toString id method and str is variable
        System.out.println(Arrays.toString(num)); // print numbers
        System.out.println(Arrays.toString(str)); // print String
        Arrays.sort(num); // sort is method for num
        Arrays.sort(str);// sort is method for str
        System.out.println(Arrays.toString(num)); // print in order
        System.out.println(Arrays.toString(str));// print in order
    }
}
