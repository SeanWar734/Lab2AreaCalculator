package lab2;

/*
 * 
 * @author seanwarchuck
 * 
 */

import java.util.Scanner;

public class AreaCalculatorApp {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		char userInput = 'y';
		while (userInput == 'y') {
			
			System.out.print("Enter Length: ");
			double length = scnr.nextInt();
		
			System.out.print("Enter Width: ");
			double width = scnr.nextInt();
		
			System.out.print("Enter Height: ");
			double height = scnr.nextInt();
		
		double area = width * length;
		double perimiter = 2 * width + 2 * length;
		double volume = height * width * length;
		
		System.out.println("Area: " + area);
		System.out.println("Perimiter: " + perimiter);
		System.out.println("Volume: " + volume);
		
		System.out.println("Continue? y/n");
		userInput = scnr.next().charAt(0);
		
		}
	}

}
