package com.pluralsight;
    import java.util.*;

public class PayrollCalc {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String name = getUsrName(inputScanner);
        double hoursWorked = getHoursWorked(inputScanner);
        double hourlyPay = getHourlyPay(inputScanner);
        double grossPay = calculateGrossPay(hoursWorked, hourlyPay);

        displayGrossPay(name, grossPay);

   }

   public static String getUsrName(Scanner scanner){
       System.out.println("Enter your name: ");
       return scanner.nextLine();
   }

   public static double getHoursWorked(Scanner scanner){
       System.out.println("Enter your hours worked: ");
       return scanner.nextDouble();
   }

   public static double getHourlyPay(Scanner scanner){
       System.out.println("Enter your hourly pay rate: ");
       return scanner.nextDouble();
   }

   public static double calculateGrossPay(double hours, double payRate){
        if (hours > 40){
            double regularPay = 40 * payRate;
            double overTimeHours = hours - 40;
            double timeHalfPay = payRate * 1.5;
            double timeHalfOTPay = overTimeHours * timeHalfPay;

            return regularPay + timeHalfOTPay;
        } else{
            return hours * payRate;
        }
    }

    public static void displayGrossPay(String name, double grossPay){
        System.out.printf("%s, your gross pay is $%.2f%n", name, grossPay);
    }
}
