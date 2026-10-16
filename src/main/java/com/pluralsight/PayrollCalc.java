package com.pluralsight;
    import java.util.*;

public class PayrollCalc {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Name entered
        System.out.println("Enter your name: ");
        String name = myScanner.next();

        // Hours worked
        System.out.println("Enter your hours worked: ");
        double hoursWorked = myScanner.nextDouble();

        // Pay Rate
        System.out.println("Enter your pay rate: ");
        double payRate = myScanner.nextDouble();

        // Overtime Calculation
        double overTime = 0;
        double timeHalf = 0;
        double grossPay = 0;

        if (hoursWorked > 40) {
            overTime = hoursWorked - 40;
            timeHalf = payRate * 1.5;
            grossPay = ((payRate) * (hoursWorked - overTime) + (overTime * timeHalf));
            System.out.println(name + " your gross pay is " + grossPay);
        }
        else {
            grossPay = hoursWorked * payRate;
            System.out.println(name + " your gross pay is " + grossPay);
        }


    }
}
