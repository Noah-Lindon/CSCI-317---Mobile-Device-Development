package com.Lindon_Assignment2.eclipse;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        double weight, height, bmi;

	        System.out.printf("Please type your weight: ");
	        weight = input.nextDouble();

	        System.out.printf("Please type your height: ");
	        height = input.nextDouble();

	        bmi = calculateBMI(weight, height);

	        System.out.printf("BMI : %.1f\n", bmi);
	        if (bmi <18.5) {
	        	System.out.println("Result: You are underweight!");
	        }
	        if (bmi <25) {
	        	System.out.println("Result: You are normal weight!");
	        }
	        if (bmi >25) {
	        	System.out.println("Result: You are overweight!");
	        }
	        if (bmi >30) {
	        	System.out.println("Result: You are obese!");
	        }
	        
	    }

	    
	    // calculate using metric measures
	    private static double calculateBMI(double weight, double height){
	        return weight / (height * height);
	    }
	}
