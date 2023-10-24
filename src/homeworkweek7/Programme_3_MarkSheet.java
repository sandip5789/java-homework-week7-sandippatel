package homeworkweek7;
/**
 * Created by Sandip Patel
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class Programme_3_MarkSheet {
    public static void main(String[] args) {
        // first reader will put all details so reader information first
        Scanner sc = new Scanner(System.in); // Step 1 declare Scanner and sc is scanner object name
        // first student name
        System.out.println("Enter student name: "); // for reader to put name
        String name = sc.nextLine(); // String because name or int for numeric and nextline because string
        // second roll number
        System.out.println("Enter Roll Number ");
        int rollNo = sc.nextInt(); // nextInt because int here
        // third subject and condition
        System.out.println("Enter Marks for Math (0 to 100): ");// Maths mark and condition no more than 100 marks
        int mathMarks = sc.nextInt();
        if (mathMarks < 0 || mathMarks > 100) { // ||use return true if 1 or 2 are true and false when both false and no less then <0 to grater >100
            System.out.println("Invalid Input, Marks should be between 0 to 100"); // print condition for reader
            return; // need return value
        }
        System.out.println("Enter Marks for Science (0 to 100: "); // same sa above for Science
        int scienceMarks = sc.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100: ");
            return;
        }
        System.out.println("Enter Marks for English (0 to 100: "); // same as above for English
        int englishMarks = sc.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100: ");
            return;
        }
        // declare variance totalMarks and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks; // totalMarks is variable
        double percentage = (totalMarks / 300.0) * 100; // double as decimal point  and each subject 100  so 300
        // now need to reults and grade
        String result, grade;
        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else {
            result = "Fail";
            grade = "N/A";
        }

        // now we have to Print the mark sheet
        System.out.println("|----------------------------|");
        System.out.println("|        Mark Sheet          |");
        System.out.println("|----------------------------|");
        System.out.println("|    Name:                   " + name);
        System.out.println("|    Roll Number:            |" + rollNo);
        System.out.println("|----------------------------");
        System.out.println("|Math        :               |"   + mathMarks);
        System.out.println("|Science     :               |" + scienceMarks);
        System.out.println("|English     :               |" + englishMarks);
        System.out.println("|----------------------------|");
        System.out.println("|Total       :               |"  + totalMarks);
        System.out.println("|----------------------------|");
        System.out.println("|Percentage: "+percentage + "%");
        System.out.println("|Result:                     |"+ result);
        System.out.println("|Grade:                      |" + grade);
        System.out.println("|-----------------------------|");
        sc.close(); // scanner close always and sc = scanner
    }

}

