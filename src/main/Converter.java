package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {

		int menuSelection = -1;
		Scanner input = new Scanner(System.in);
		int b = -1;
		double amount;
		double otherAmount;
		
		String[] convertables = {"Teaspoons", "Tablespoons", "Ounces", "Cups", 
								"Pints", "Quarts", "Gallons", "Quit"}; 

		while (menuSelection != 8) {

			System.out.println("Enter the number corresponding to what you are converting from: ");
			for (int i = 0; i < convertables.length; i++) {
				System.out.println((i + 1) + ". " + convertables[i]);
			}
			menuSelection = input.nextInt();
		
			menuSelection = Methods.test(menuSelection);
		
		if (menuSelection == 8){
			System.out.println("The program is closing.");
			break;
		}
			
		if (menuSelection != -1) {
		System.out.println("\nEnter the number corresponding to what you are converting " + convertables[(menuSelection - 1)] + " to: ");
			
		
		for (int i = 0; i < convertables.length; i++) {
			if (menuSelection - 1 == i) {
				System.out.println("");
				continue;
			}
			System.out.println((i + 1) + ". " + convertables[i]);
		}
	
		b = input.nextInt();
		
		b = Methods.test(b);
		
		if (b == 8) {
			menuSelection = b;
			System.out.println("The program is closing.");
			break;
		}
		if (b == -1) {
			menuSelection = -1;
		}
		}
			switch (menuSelection) {
			case 1:
				 amount = Methods.getInfo(input,convertables[menuSelection - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTsp(amount, b);
				 Methods.inform(convertables[menuSelection - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 2:
				 amount = Methods.getInfo(input,convertables[menuSelection - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTbsp(amount, b);
				Methods.inform(convertables[menuSelection - 1], convertables[b - 1], amount, otherAmount);
				break;
		
			case 3:
				 amount = Methods.getInfo(input,convertables[menuSelection - 1],convertables[b - 1]);
				 otherAmount = Methods.convertOz(amount, b);
				Methods.inform(convertables[menuSelection - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 4:
				 amount = Methods.getInfo(input,convertables[menuSelection - 1],convertables[b - 1]);
				 otherAmount = Methods.convertCup(amount, b);
				Methods.inform(convertables[menuSelection - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 5:
				 amount = Methods.getInfo(input,convertables[menuSelection - 1],convertables[b - 1]);
				 otherAmount = Methods.convertPt(amount, b);
				Methods.inform(convertables[menuSelection - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 6:
				 amount = Methods.getInfo(input,convertables[menuSelection - 1],convertables[b - 1]);
				 otherAmount = Methods.convertQt(amount, b);
				Methods.inform(convertables[menuSelection - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 7:
				 amount = Methods.getInfo(input,convertables[menuSelection - 1],convertables[b - 1]);
				 otherAmount = Methods.convertGal(amount, b);
				Methods.inform(convertables[menuSelection - 1], convertables[b - 1], amount, otherAmount);
				break;
				default:
					System.out.println("Your input does not meet expected range. \nPlease try again.\n");
			}

		}
	
		input.close();
		System.out.println("Good bye.");
	}

}
