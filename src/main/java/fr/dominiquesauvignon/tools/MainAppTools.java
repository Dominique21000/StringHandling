package fr.dominiquesauvignon.tools;

public class MainAppTools {

	public static String captureOneString() {
		StringBuilder capture = new StringBuilder();
		return capture.toString();
	}
			
	public static String repeatNThisCharact(int nb, char c) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < nb ;i++) {
			str.append(c);
		}
		str.append("\n");
		return str.toString();
	}
	
	public static String getMessageStringNonStillCaptured() {
		StringBuilder err = new StringBuilder();
		err.append("=> =======\n");
		err.append("Attention, vous n'avez pas encore saisi la chaine !\n");
		err.append("Veuillez donc d'abord saisir la chaine => choix 1 !\n");
		return err.toString();
	}
}
