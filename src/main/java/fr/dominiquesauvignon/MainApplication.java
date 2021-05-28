package fr.dominiquesauvignon;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import fr.dominiquesauvignon.business.StringHandle;
import fr.dominiquesauvignon.model.Capture;
import fr.dominiquesauvignon.tools.MainAppTools;

public class MainApplication {

	public static void main(String[] args) {
		run();	
	}
	
	public static void run() {
		Boolean suite = true;
		Capture capturedString = new Capture(); 
		
		StringBuilder intro = new StringBuilder();
		intro.append("***********************************************\n");
		intro.append("*                                             *\n");
		intro.append("* Bienvenue dans le programme de manipulation *\n");
		intro.append("*          des chaines de caractères          *\n");
		intro.append("*                                             *\n");
		intro.append("*           par Dominique SAUVIGNON           *\n");
		intro.append("* --------------------------------------------*\n");
		intro.append("***********************************************");
		
		System.out.println(intro.toString());
		
		StringBuilder menu = new StringBuilder();
		menu.append(MainAppTools.repeatNThisCharact(80,'='));
		menu.append("=> M E N U \n");
		menu.append(MainAppTools.repeatNThisCharact(80,'-'));
		menu.append("* 1 -> saisie d'une chaine / remplacement de la chaine\n");
		menu.append("* 2 -> affichage de la chaine\n");
		menu.append("* 3 -> la chaine en majuscule\n");
		menu.append("* 4 -> Affichage d'informations sur la chaine\n");
		menu.append(MainAppTools.repeatNThisCharact(80,'_'));
		menu.append("\n");
		menu.append("* => 99 - sortir du programme\n");
		menu.append(MainAppTools.repeatNThisCharact(80,'='));
		menu.append("\n");
		menu.append("Veuillez saisir votre choix : ");
		
		// displays of the Menu 
		// capture of the choice
		do {
			System.out.println(menu.toString());
			
			Scanner sc = new Scanner(System.in);
			String choice = sc.nextLine();
			
			switch(choice) {
			case "1" : 
				displayTitleOfChoice(1, "Saisie de la chaine");
				capturedString.setString(StringHandle.captureOfAString());
				break;
				
			case "2":
				/*StringBuilder sb2 = new StringBuilder();
				sb2.append(MainAppTools.repeatNThisCharact(80, '-'));
				sb2.append("Choix 2 : Affichage de la chaine\n");
				sb2.append(MainAppTools.repeatNThisCharact(80, '-'));
				System.out.println(sb2.toString());
				
				*/
				displayTitleOfChoice(2, "Affichage de la chaîne");
				try {
					StringHandle.displayString(capturedString.getString());
				}
				catch (NullPointerException e) {
					System.err.println(MainAppTools.getMessageStringNonStillCaptured());
				}
				
				break;
				
			case "3":
				StringBuilder sb3 = new StringBuilder();
				sb3.append(MainAppTools.repeatNThisCharact(80, '-'));
				sb3.append("Choix 3 : Affichage de la chaine an majuscules\n");
				sb3.append(MainAppTools.repeatNThisCharact(80, '-'));
				System.out.println(sb3.toString());
				try {
					StringHandle.displayStringInUpperCase(capturedString.getString());
				}
				catch (NullPointerException np) {
					System.err.println(MainAppTools.getMessageStringNonStillCaptured());
				}
				break;
				
			case "4" :
				displayTitleOfChoice(4, "Affichage d'informations sur la chaine");
				String[] tabString; 
				try {
					tabString = capturedString.toString().split(" ");
					StringBuilder display = new StringBuilder();
					display.append("La chaine saisie (");
					display.append(capturedString.getString());
					display.append(") présent les caractéristiques : \n");
					display.append("- Nombre de mots : ");
					display.append(tabString.length-1);
					display.append("\n");
					display.append("- taille de la chaine : ");
					display.append(capturedString.getString().length());
					System.out.println(display.toString());
				}
				catch (NullPointerException e) {
					System.err.println(MainAppTools.getMessageStringNonStillCaptured());
				}
				break;
				
			case "99":
				suite = false;
				System.out.println("Au revoir :-)...");
				System.exit(0);
				break;
				
			default:
				System.err.println("Vous n'avez pas entrée une valeur correcte.");
			}
			
			
		} while(suite);
		
		//
		StringBuilder capture = new StringBuilder("Veuillez saisir votre choix ? ");
		System.out.println(capture.toString());
		

		StringBuilder displayChoice = new StringBuilder();
		displayChoice.append("Vous avez saisi : ");
		displayChoice.append(capture);
		displayChoice.append("------------------------");
		System.out.println(displayChoice.toString());
	}

	public static void displayTitleOfChoice(int nb, String title) {
		StringBuilder sb = new StringBuilder();
		sb.append(MainAppTools.repeatNThisCharact(80, '-'));
		sb.append("Choix n° ");
		sb.append(nb);
		sb.append(" : " + title + "\n");
		sb.append(MainAppTools.repeatNThisCharact(80, '-'));
		System.out.println(sb.toString());
	}
	
}
