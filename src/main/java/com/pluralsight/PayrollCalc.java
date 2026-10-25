package com.pluralsight;
    import java.util.*;

public class PayrollCalc {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

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


}
