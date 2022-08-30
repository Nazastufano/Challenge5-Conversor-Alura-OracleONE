package ar.com.alura.conversor.modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
	
	public static List<String> tipoDeConversion() {
		List<String> lista = new ArrayList<>();	
		lista.add("Conversor de Moneda");
		lista.add("Conversor de Temperatura");
		return lista;
	}
	
	public static List<Double> listarValores() {
		double dolar = 138.30;
		double euro = 138.28;
		double libra = 161.89;
		double yen = 1;
		double wonCoreano = 0.10;
		double dolarPesos = 0.0072;
		double euroPesos = 0.0072;
		double libraPesos = 0.0062;
		double yenPesos = 1;
		double wonCoreanoPesos = 9.73;
		
		List<Double> valores = new ArrayList<>();
		valores.add(dolar);
		valores.add(euro);
		valores.add(libra);
		valores.add(yen);
		valores.add(wonCoreano);
		valores.add(dolarPesos);
		valores.add(euroPesos);
		valores.add(libraPesos);
		valores.add(yenPesos);
		valores.add(wonCoreanoPesos);
		
		return valores;
	}
	public static List<String> listarTipo() {
		List<String> lista = new ArrayList<>();	
		lista.add("De Pesos a Dólar");
		lista.add("De Pesos a Euro");
		lista.add("De Pesos a Libras");
		lista.add("De Pesos a Yen");
		lista.add("De Pesos a Won Coreano");
		lista.add("De Dólar a Pesos");
		lista.add("De Euro a Pesos");
		lista.add("De Libra a Pesos");
		lista.add("De Yen a Pesos");
		lista.add("De Won Coreano a Pesos");
		
		return lista;
	}
	
	public static List<String> listarTipo2() {
		List<String> lista = new ArrayList<>();	
		lista.add("De Celsius a Fahrenheit");
		lista.add("De Celsius a Kelvin");
		lista.add("De Fahrenheit a Celsius");
		lista.add("De Fahrenheit a Kelvin");
		lista.add("De Kelvin a Celsius");
		lista.add("De Kelvin a Fahrenheit");

		return lista;
	}
}
