package main;

import java.util.Scanner;

public class Methods {

	public static void inform(String thing1, String thing2, double amount1, double amount2) {
		System.out.printf("There are %.2f %s in %.2f %s .%n", amount2, thing2, amount1, thing1);
	//	System.out.printf("'%s %f0.2 %s %f10.0 %s %n' There are " + amount2 + " " + thing2 + " in " + amount1 + " " + thing1 + ".");
	}
	
	public static double getInfo(Scanner input, String thing1, String thing2) {
		
		System.out.println("\nEnter the amount of " + thing1 + " to be converted into " + thing2 + ": ");
		
		return input.nextDouble();
	}

	public static int test(int a) {

		if (a >= 1 && a <= 8) {
			return a;
		}
		return -1;
	}
	
	public static double convertTsp(double amount, int b) {
		switch(b) {
		case 2:
			return amount / 3;
		case 3:
			return amount / 6;
		case 4:
			return amount / 48.692;
		case 5:
			return amount / 96;
		case 6:
			return amount / 192;
		case 7:
			return amount / 768;
			default:
				return -1;
		}
	}
	
	public static double convertTbsp(double amount, int b) {
		switch(b) {
		case 1:
			return amount * 3;
		case 3:
			return amount / 2;
		case 4:
			return amount / 16.231;
		case 5:
			return amount / 32;
		case 6:
			return amount / 64;
		case 7:
			return amount / 256;
			default:
				return -1;
		}
	}
	
	public static double convertOz(double amount, int b) {
		switch(b) {
		case 2:
			return amount * 2;
		case 1:
			return amount * 6;
		case 4:
			return amount / 8.115;
		case 5:
			return amount / 16;
		case 6:
			return amount / 32;
		case 7:
			return amount / 128;
			default:
				return -1;
		}
	}
	
	public static double convertCup(double amount, int b) {
		switch(b) {
		case 2:
			return amount * 16.231;
		case 3:
			return amount * 8.115;
		case 1:
			return amount * 48.692;
		case 5:
			return amount / 1.972;
		case 6:
			return amount / 3.943;
		case 7:
			return amount / 15.773;
			default:
				return -1;
		}
	}
	
	public static double convertPt(double amount, int b) {
		switch(b) {
		case 2:
			return amount * 32;
		case 3:
			return amount * 16;
		case 4:
			return amount * 1.927;
		case 1:
			return amount * 96;
		case 6:
			return amount / 2;
		case 7:
			return amount / 8;
			default:
				return -1;
		}
	}
	
	public static double convertQt(double amount, int b) {
		switch(b) {
		case 2:
			return amount * 64;
		case 3:
			return amount * 32;
		case 4:
			return amount * 3.943;
		case 5:
			return amount * 2;
		case 1:
			return amount * 192;
		case 7:
			return amount / 4;
			default:
				return -1;
		}
	}
	
	public static double convertGal(double amount, int b) {
		switch(b) {
		case 2:
			return amount * 256;
		case 3:
			return amount * 128;
		case 4:
			return amount * 15.773;
		case 5:
			return amount * 8;
		case 6:
			return amount * 4;
		case 1:
			return amount * 768;
			default:
				return -1;
		}
	}
}
