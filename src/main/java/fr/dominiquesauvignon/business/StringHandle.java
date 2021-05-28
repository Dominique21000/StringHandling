package fr.dominiquesauvignon.business;

import java.util.Scanner;

import fr.dominiquesauvignon.tools.MainAppTools;

public class StringHandle {
	
	public static String captureOfAString() {
		System.out.println("Veuillez saisir la chaine : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}
	
	public static void displayString(String str) {
		StringBuilder displayResult = new StringBuilder();
		displayResult.append("Chaine saisie  : ");
		displayResult.append(str.toString());
		displayResult.append("\n");
		displayResult.append(MainAppTools.repeatNThisCharact(80, '_'));
		System.out.println(displayResult.toString());
	}

	public static void displayStringInUpperCase(String str) {
		StringBuilder displayResult = new StringBuilder();
		
		displayResult.append("Chaine saisie  en majuscule : ");
		displayResult.append(str.toUpperCase());
		displayResult.append("\n");
		displayResult.append(MainAppTools.repeatNThisCharact(80, '_'));
		System.out.println(displayResult.toString());
	}
	
	
}
