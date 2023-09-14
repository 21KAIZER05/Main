/*
Name:Jandoc,Kaizer Franz J
Programming Date: September 14, 2023,
Activity Name and Number: Prelim Exercise Number 7
*/
package main;
import java.util.Scanner;

public class Dispenser {

    public static void main(String[] args) {
        // Read the amount of money that will be withdrawn from the ATM
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of money to be withdrawn: ");
        int amount = scanner.nextInt();

        // Compute the least number of peso bills (P100 peso bills, P500 peso bills, P1000 peso bills) that will be dispensed by the machine for the requested amount
        int thousandBills = amount / 1000;
        int fiveHundredBills = (amount % 1000) / 500;
        int hundredBills = (amount % 500) / 100;

        // Determine the amount of money corresponding to each peso bill dispensed
        int thousandAmount = thousandBills * 1000;
        int fiveHundredAmount = fiveHundredBills * 500;
        int hundredAmount = hundredBills * 100;

        // Compute the sum total of number of bills dispensed
        int totalBills = thousandBills + fiveHundredBills + hundredBills;

        // Compute the sum total of amounts per denomination
        int totalamount= thousandAmount+ fiveHundredAmount+hundredBills;

        // Output the results
        System.out.println("The least number of peso bills that will be dispensed by the machine are:");
        System.out.println("P1000 peso bills: " + thousandBills);
        System.out.println("P500 peso bills: " + fiveHundredBills);
        System.out.println("P100 peso bills: " + hundredBills);
        System.out.println();
        System.out.println("The amount of money corresponding to each peso bill dispensed is:");
        System.out.println("P1000 peso bills: P" + thousandAmount);
        System.out.println("P500 peso bills: P" + fiveHundredAmount);
        System.out.println("P100 peso bills: P" + hundredAmount);
        System.out.println();
        System.out.println("The sum total of number of bills dispensed is: " + totalBills);
        System.out.close();
    }
}