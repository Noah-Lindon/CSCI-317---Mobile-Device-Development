// Assignment 1 Noah Lindon
package com.Noah_Lindon.eclipse;

public class Main {

	public static void main(String[] args) {
		// Assignment 1 Question #1
		int price = 152365;
		int fifty_bill = price / 50000;
		int ten_bill = price % 50000 / 10000;
		int fiveThousand_bill = price % 10000 / 5000;
		int oneThousand_bill = price % 5000 / 1000;
		
		int discount = price % 1000;
		
		int count = fifty_bill + ten_bill + fiveThousand_bill + oneThousand_bill;
		System.out.printf("Fiftythousand x %d\n", fifty_bill);
		System.out.printf("tenthousand x %d\n", ten_bill);
		System.out.printf("fivethousand x %d\n", fiveThousand_bill);
		System.out.printf("onethousand x %d\n", fifty_bill);
		System.out.printf("-------------------\n");
		System.out.printf("Total Count: %d\n", count);
		System.out.printf("Total Amount: x %d\n", price-discount);
		System.out.printf("Discount: x %d\n", discount);
		
		//Assignment 1 Question #2
		double time = 5.0;
		double gravity = -9.81;
		double initialVelocity = 0.0;
		double initialPosition = 1000;
		
		double finalPosition = 0.5 * gravity * time * time;
		finalPosition += initialVelocity * time;
		finalPosition += initialPosition;
		
		System.out.printf("Position after %.2f seconds: %.2fm\n", time, finalPosition);
		
	}

}
