package main;

import java.lang.Integer;
import java.util.Scanner;

public class Methods {

	public static void inform(String thing1, String thing2, double amount1, double amount2) {
		System.out.println("\nThere are " + amount2 + " " + thing2 + " in " + amount1 + " " + thing1 + ".\n");
	}
	
	public static double getInfo(Scanner input, String thing1, String thing2) {
		
		System.out.println("\nEnter the amount of " + thing1 + " to be converted into " + thing2 + ": ");
		
		return input.nextDouble();
	}
	
	public static int putTwoIntsTogether(int a, int b) {
		String temp = "" + a + b;
		
		return Integer.parseInt(temp);
	}
	

	public static double convertOz2Tsp(double amount) {
		// TODO Auto-generated method stub
		return amount * 6;
	}

	public static double convertOz2Tbsp(double amount) {
		// TODO Auto-generated method stub
		return amount * 2;
	}

	public static double convertOz2Qt(double amount) {
		// TODO Auto-generated method stub
		return amount / 32;
	}

	public static double convertOz2Cup(double amount) {
		// TODO Auto-generated method stub
		return amount / 8.115;
	}

	public static double convertOz2Gal(double amount) {
		// TODO Auto-generated method stub
		return amount / 128;
	}

	public static double convertTsp2Oz(double amount) {
		// TODO Auto-generated method stub
		return amount / 6;
	}

	public static double convertTsp2Tbsp(double amount) {
		// TODO Auto-generated method stub
		return amount / 3;
	}

	public static double convertTsp2Cup(double amount) {
		// TODO Auto-generated method stub
		return amount / 48.692;
	}

	public static double convertTsp2Qt(double amount) {
		// TODO Auto-generated method stub
		return amount / 192;
	}

	public static double convertTsp2Gal(double amount) {
		// TODO Auto-generated method stub
		return amount / 768;
	}

	public static double convertTbsp2Oz(double amount) {
		// TODO Auto-generated method stub
		return amount / 2;
	}

	public static double convertTbsp2Tsp(double amount) {
		// TODO Auto-generated method stub
		return amount * 3;
	}

	public static double convertTbsp2Cup(double amount) {
		// TODO Auto-generated method stub
		return amount / 16.231;
	}

	public static double convertTbsp2Qt(double amount) {
		// TODO Auto-generated method stub
		return amount / 64;
	}

	public static double convertTbsp2Gal(double amount) {
		// TODO Auto-generated method stub
		return amount / 256;
	}

	public static double convertCup2Oz(double amount) {
		// TODO Auto-generated method stub
		return amount * 8.115;
	}
	
	public static double convertCup2Tbsp(double amount) {

		return amount * 16.231;
	}

	public static double convertCup2Qt(double amount) {
		// TODO Auto-generated method stub
		return amount / 3.943;
	}

	public static double convertCup2Gal(double amount) {
		// TODO Auto-generated method stub
		return amount / 15.773;
	}

	public static double convertQt2Oz(double amount) {
		// TODO Auto-generated method stub
		return amount * 32;
	}

	public static double convertQt2Tsp(double amount) {
		// TODO Auto-generated method stub
		return amount * 192;
	}

	public static double convertQt2Tbsp(double amount) {
		// TODO Auto-generated method stub
		return amount * 64;
	}

	public static double convertQt2Cup(double amount) {
		// TODO Auto-generated method stub
		return amount * 3.943;
	}

	public static double convertQt2Gal(double amount) {
		// TODO Auto-generated method stub
		return amount / 4;
	}

	public static double convertGal2Oz(double amount) {
		// TODO Auto-generated method stub
		return amount * 128;
	}

	public static double convertGal2Tsp(double amount) {
		// TODO Auto-generated method stub
		return amount * 768;
	}

	public static double convertGal2Tbsp(double amount) {
		// TODO Auto-generated method stub
		return amount * 256;
	}

	public static double convertGal2Cup(double amount) {
		// TODO Auto-generated method stub
		return amount * 15.773;
	}

	public static double convertGal2Qt(double amount) {
		// TODO Auto-generated method stub
		return amount * 4;
	}

	public static double convertCup2Tsp(double amount) {
		// TODO Auto-generated method stub
		return amount * 48.692;
	}

	public static double convertTsp2Pt(double amount) {
		// TODO Auto-generated method stub
		return amount / 96;
	}

	public static double convertOz2Pt(double amount) {
		// TODO Auto-generated method stub
		return  amount / 16;
	}

	public static double convertTbsp2Pt(double amount) {
		// TODO Auto-generated method stub
		return amount / 32;
	}

	public static double convertPt2Tsp(double amount) {
		// TODO Auto-generated method stub
		return amount * 96;
	}

	public static double convertPt2Tbsp(double amount) {
		// TODO Auto-generated method stub
		return amount * 32;
	}

	public static double convertPt2Oz(double amount) {
		// TODO Auto-generated method stub
		return amount * 16;
	}

	public static double convertPt2Cup(double amount) {
		// TODO Auto-generated method stub
		return amount  * 1.927;
	}

	public static double convertPt2Qt(double amount) {
		// TODO Auto-generated method stub
		return amount / 2;
	}

	public static double convertPT2Gal(double amount) {
		// TODO Auto-generated method stub
		return amount / 8;
	}

	public static double convertCup2Pt(double amount) {
		// TODO Auto-generated method stub
		return amount / 1.972;
	}

	public static double convertQt2Pt(double amount) {
		// TODO Auto-generated method stub
		return amount * 2;
	}

	public static double convertGal2Pt(double amount) {
		// TODO Auto-generated method stub
		return amount * 8;
	}

	public static int test(int a) {

		if (a >= 1 && a <= 8) {
			return a;
		}
		return -1;
	}
}
