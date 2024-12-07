package lab5;

import java.util.Scanner;

public class ChocolateBarCounter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt user for input
	        System.out.print("How many dollars would you like to spend on chocolate from the vending machine? ");
	        int dollars = scanner.nextInt();
	        
	        // Validate the input
	        if (dollars < 0) {
	            System.out.println("Invalid value for amount! Exiting the program!");
	            return;
	        }
	        
	        // Constants
	        final int COST_PER_BAR = 1;
	        final int COUPONS_NEEDED_FOR_BAR = 6;

	        // Calculate initial number of chocolate bars and coupons
	        int totalBars = dollars; // Each dollar buys one bar
	        int totalCoupons = totalBars; // Each bar comes with one coupon
	        
	        // Redeem coupons for additional chocolate bars
	        while (totalCoupons >= COUPONS_NEEDED_FOR_BAR) {
	            int additionalBars = totalCoupons / COUPONS_NEEDED_FOR_BAR; // Calculate how many bars can be bought with coupons
	            totalBars += additionalBars; // Update total bars eaten
	            totalCoupons = totalCoupons % COUPONS_NEEDED_FOR_BAR + additionalBars; // Update remaining coupons
	        }
	        
	        // Display results
	        System.out.println("You can buy " + totalBars + " chocolate bars and will have " + totalCoupons + " coupons left!");
	        
	        // Close the scanner
	        scanner.close();
	    }
	}
