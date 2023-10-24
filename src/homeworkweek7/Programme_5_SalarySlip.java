package homeworkweek7;

import java.util.Scanner;

/**
 * Created by Sandip Patel
 * Salary Slip
 *  WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and  salary
 */

public class Programme_5_SalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare scanner
        System.out.println("Enter Employee ID: "); // user insert ID
        int employeeID = sc.nextInt(); // int because number nextInt is method
        sc.nextLine();
        System.out.println("Enter Employee Name: "); // user insert name
        String employeeName = sc.nextLine(); // String because name and nextLine is method
        System.out.println("Enter Basic Salary: "); // user insert salary
        double basicSalary = sc.nextDouble(); // double because desimal number and nextDouble is method


        // Calculate HRA, TA, DA, PF and Gross Salary
        double hra = 0.10 * basicSalary; //basicSalary is variable and 10% so 0.10
        double ta = 0.08 * basicSalary; // 8% so 0.08
        double da = 0.09 * basicSalary; // 9% so 0.09
        double pf = 0.20 * basicSalary; // 20% so .20
        double grossSalary = basicSalary + hra + ta + da - pf; // all variables

        // To Print all the details
        System.out.println("----------------------------------------------------");
        System.out.println("|                    Salary Slip                   |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("| Employee ID   :  " + employeeID + "              |");
        System.out.println("| Employee Name :  " + employeeName + "            |");
        System.out.println("|---------------------------------------------------");
        System.out.println("| Basic Salary  :  " + basicSalary  + "            |");
        System.out.println("| HRA 10%       :  " + hra + "                     |");
        System.out.println("| TA 8%         :  " + ta  + "                     |");
        System.out.println("| Da 9%         :  " + da  + "                     |");
        System.out.println("| PF-20%        :  " + pf  + "                     |");
        System.out.println("| -------------------------------------------------|");
        System.out.println("| Gross Salary  :  " + grossSalary + "             |");
        System.out.println("| =================================================|");

sc.close();
    }

}
