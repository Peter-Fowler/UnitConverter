package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {

		int menuSelection = -1;
		Scanner input = new Scanner(System.in);
		int a = -1;
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
		a = input.nextInt();
		
		a = Methods.test(a);
		
		if (a == 8){
			menuSelection = a;
			System.out.println("The program is closing.");
			break;
		}
		
		if (a == -1) {
			menuSelection = 99;
		}
			
		if (menuSelection != 99) {
		System.out.println("\nEnter the number corresponding to what you are converting " + convertables[(a - 1)] + " to: ");
			
		
		for (int i = 0; i < convertables.length; i++) {
			if (a - 1 == i) {
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
			menuSelection = 99;
		}
		if (menuSelection != 99) {
			menuSelection = Methods.putTwoIntsTogether(a, b);
		}
		}
			switch (menuSelection) {
			case 12:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTsp2Tbsp(amount);
				 Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 13:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTsp2Oz(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 14:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTsp2Cup(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 15:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTsp2Pt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 16:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTsp2Qt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 17:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTsp2Gal(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 21:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTbsp2Tsp(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 23:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTbsp2Oz(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 24:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTbsp2Cup(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 25:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTbsp2Pt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 26:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTbsp2Qt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 27:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertTbsp2Gal(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 31:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertOz2Tsp(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 32:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertOz2Tbsp(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 34:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertOz2Cup(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 35:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertOz2Pt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 36:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertOz2Qt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 37:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertOz2Gal(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 41:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertCup2Tsp(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 42:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertCup2Tbsp(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 43:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertCup2Oz(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 45:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertCup2Pt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 46:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertCup2Qt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 47:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertCup2Gal(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 51:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertPt2Tsp(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 52:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertPt2Tbsp(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 53:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertPt2Oz(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 54:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertPt2Cup(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 56:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertPt2Qt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 57:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertPT2Gal(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 61:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertQt2Tsp(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 62:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertQt2Tbsp(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 63:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertQt2Oz(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 64:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertQt2Cup(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 65:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertQt2Pt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 67:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertQt2Gal(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 71:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertGal2Tsp(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 72:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertGal2Tbsp(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 73:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertGal2Oz(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 74:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertGal2Cup(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 75:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertGal2Pt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
			case 76:
				 amount = Methods.getInfo(input,convertables[a - 1],convertables[b - 1]);
				 otherAmount = Methods.convertGal2Qt(amount);
				Methods.inform(convertables[a - 1], convertables[b - 1], amount, otherAmount);
				break;
				default:
					System.out.println("Your input does not meet expected range. \nPlease try again.\n");
			}

		}
	
		input.close();
		System.out.println("Good bye.");
	}

}
