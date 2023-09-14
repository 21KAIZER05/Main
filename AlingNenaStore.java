/*
Name:Jandoc,Kaizer Franz J
Programming Date: September 05, 2023,
Activity Name and Number: Prelim Exercise Number 6

*/
package main;

import java.util.Scanner;

        public class AlingNenaStore {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Get the product name, quantity, unit price, and discount.
            System.out.print("Product: ");
            input.nextLine();
            System.out.print("Quantity: ");
            int quantity = input.nextInt();
            System.out.print("Unit Price: ");
            double unitPrice = input.nextDouble();
            System.out.print("Discount: ");
            double discount = input.nextDouble();

            // Calculate the total purchase amount.
            double totalPurchaseAmount = quantity * unitPrice;

            // Calculate the total discount.
            double totalDiscount = totalPurchaseAmount * discount / 100;

            // Calculate the amount to be paid.
            double amountToBePaid = totalPurchaseAmount - totalDiscount;

            // Get the cash tendered.
            System.out.print("Cash Tendered: ");
            double cashTendered = input.nextDouble();

            // Calculate the change.
            double change = cashTendered - amountToBePaid;

            // Display the output.
            System.out.println("Total Purchase Amount: " + totalPurchaseAmount);
            System.out.println("Total Discount: " + totalDiscount);
            System.out.println("Amount To Be Paid: " + amountToBePaid);
            System.out.println("Change: " + change);
            System.out.close();
        }
    }

