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
        double regularHours = myScanner.nextDouble();

        // Pay Rate
        System.out.println("Enter your pay rate: ");
        double hourlyPay = myScanner.nextDouble();

        // Overtime Calculation
        double overTimeHours = 0;
        double timeHalfPay = 0;
        double grossPay = 0;
        double regularHourlyPay = (regularHours - overTimeHours) * hourlyPay;
        double timeHalfOTPay = overTimeHours * timeHalfPay;

        if ( regularHours > 40) {
            overTimeHours = regularHours - 40;
            timeHalfPay = hourlyPay * 1.5;
            grossPay = regularHourlyPay + timeHalfOTPay;
            System.out.println(name + " your gross pay is " + grossPay);
        }
        else {
            grossPay = regularHours * hourlyPay;
            System.out.println(name + " your gross pay is " + grossPay);
        }


    }
}
