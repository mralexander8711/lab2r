package Generator;

import java.util.Scanner;

public class roomdetails {

	static Scanner scnr = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice = "y";
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
	     
		while (choice.equalsIgnoreCase("y")) {
		Scanner scnr = new Scanner(System.in);
	    
		System.out.println("Enter Length:");
        double length = scnr.nextDouble();
        
		System.out.println("Enter Width:");
		double width = scnr.nextDouble();
		
		System.out.println("Enter Height:");
		double height = scnr.nextDouble();
		
		
		double Area =length * width;
		System.out.println("Area:"+ Area);
		double Volume= length * width * height;
		System.out.println("Volume:"+ Volume);
		double Preimeter= 2*length + 2*width;
		System.out.println("Preimeter:"+ Preimeter);		
		
		System.out.println("Do you want to continue? (y/n):");
		choice = scnr.next();

	   }
	}
}
