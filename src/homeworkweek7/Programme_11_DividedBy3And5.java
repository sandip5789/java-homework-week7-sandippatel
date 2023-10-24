package homeworkweek7;

/**
 *  Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately
 * Created by Sandip Patel
 */

public class Programme_11_DividedBy3And5 {
    public static void main(String[] args) {
        System.out.println("\nDivided by 3: "); // print statement number divided by 3 and \n only
        for (int i = 1; i < 100; i++) { // loops are used to repeat a block of code
            if (i % 3 == 0)
                System.out.println(i + ", "); // print answer
        }
            System.out.println("\nDivided by 5 ");
            for (int i = 1; i < 100; i++){ // print statement number divided by 5 and \n only
                if (i % 5 == 0)
                    System.out.println(i + ", ");
            }

        }
    }

