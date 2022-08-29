package ar.com.alura.conversor.validar;

public class Validar {
	
	public static boolean isNumber(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

}
