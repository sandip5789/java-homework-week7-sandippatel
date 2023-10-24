package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Created by Sandip Patel
 */

public class Programme_7_Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare scanner
        System.out.println("Enter Sales ID:");// user print sales id
        int salesId = sc.nextInt(); // salesId called and int = nextInt
        System.out.println("Seller's Name:");// use print seller's name
        String sellerName = sc.next(); // sellerName called = String because name and next only no int
        System.out.println("Sales Amount:"); // use print sales amount
        double salesAmount = sc.nextDouble(); // salesAmount called and nextdouble
        System.out.println("Enter Salary Basic"); // user print salary basic
        double salaryBasic = sc.nextDouble(); // called salry basic
        // commission calculated
        double commission = calculateCommission(salesAmount);
        // total salary calculated
        double totalSalary = salaryBasic + commission;

        // print all results
        System.out.println("Sales ID: " + salesId);// salesId variable
        System.out.println("Seller's Name: " + sellerName);//sellerName
        System.out.println("Sales Amount: " + salesAmount);// salesAmount
        System.out.println("Salary Basic: " + salaryBasic);//salaryBasic
        System.out.println("Commission: " + commission);//commission
        System.out.println("Total Salary:" + totalSalary);//totalSalary
        sc.close();

    }

    public static double calculateCommission(double salesAmount) {
        double commissionRate;
        if (salesAmount < 10000) {
            commissionRate = 0.02; // 2% commission for sales less than  10000
        } if (salesAmount >= 10000) ;
        {

            commissionRate = 0.05; // 5% commission for sales 10000

        } if (salesAmount >= 20000) ;
        {
            commissionRate = 0.10; // 10% commission for sales between 10000 to 20000
        } if (salesAmount >= 30000) ;
        {
            commissionRate = 0.20; // 20% commission for sales between 20000 to 30000


        }if (salesAmount >=50000){
            commissionRate = 0.35; // 35% commission over 50000
        }
        return salesAmount * commissionRate;
    }
}