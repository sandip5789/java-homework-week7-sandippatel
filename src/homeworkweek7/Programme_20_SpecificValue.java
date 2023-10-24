package homeworkweek7;

/**
 * Write a Java program to test if an array contains a specific value.
 * Created by Sandip Patel
 */
// declare main method
public class Programme_20_SpecificValue {
    public static void main(String[] args) {
        int[] num = { 80, 90, 100, 120, 200, 150, 200}; // array numbers
        System.out.println(contains(num,150)); // true
        System.out.println(contains(num,70));// false
        }
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) { // for loop method use
            if (item == n) {
                return true; // first statement true
            }
        }
        return false; // second statement false
    }
    }


