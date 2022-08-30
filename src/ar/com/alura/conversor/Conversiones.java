package ar.com.alura.conversor;

public class Conversiones {
	
	public static double convertir(double valor, double valor2) {
		return valor * valor2;
	}
	
	public static double celFar(double cel) {
		//ºC a ºF:   ºF = ºC x 1.8 + 32.
		return cel * 1.8 + 32;
	}
	
	public static double farCel(double far) {
		//ºF a ºC:   ºC = (ºF-32) ÷ 1.8.
		return (far-32) / 1.8;
	}
	public static double kelCel(double kel) {
		//K a ºC:   ºC =  K – 273.15
		return kel - 273.15;
	}
	public static double celKel(double cel) {
		//ºC a K: K =     ºC + 273.15.
		return cel + 273.15;
	}
	public static double farKel(double far) {
		//ºF a K: K =     5/9 (ºF – 32) + 273.15.
		return (far - 32) + 273.15;
	}
	public static double kelFar(double kel) {
		//K a ºF:         ºF = 1.8(K – 273.15) + 32.
		return (1.8*(kel - 273.15)) + 32;
	}
	
	public static double convertidor(int i, double valorAConvertir) {
		double valorConvertido = 0;
		switch(i) {
		case 0:
			valorConvertido = Conversiones.celFar(valorAConvertir);
			break;
		case 1: 
			valorConvertido = Conversiones.farCel(valorAConvertir);
			break;
		case 2:
			valorConvertido = Conversiones.kelCel(valorAConvertir);
			break;
		case 3: 
			valorConvertido = Conversiones.celKel(valorAConvertir);
			break;
		case 4:
			valorConvertido = Conversiones.farKel(valorAConvertir);
			break;
		case 5: 
			valorConvertido = Conversiones.kelFar(valorAConvertir);
			break;
		}
		return valorConvertido;
	}
}
