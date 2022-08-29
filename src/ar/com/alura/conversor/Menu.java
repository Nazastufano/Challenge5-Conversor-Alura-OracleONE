package ar.com.alura.conversor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import ar.com.alura.conversor.validar.*;

public class Menu {
	public static void main(String[] args) {
		
		int resp = 0;
		
		while(resp == 0) {	
			String cantidadDeConversion;
			
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
			
			JOptionPane.showInputDialog(null,
					"Seleccione una opcion de conversion",
					"Menu",
					JOptionPane.PLAIN_MESSAGE,
					null,
					new Object[] {"Conversor de Moneda",
							"Conversor de Temperatura"},
					"Conversor de Moneda");
		
			Object valor = JOptionPane.showInputDialog(null,
					"Elije la moneda a la que deseas convertir a tu dinero",
					"Monedas", 
					JOptionPane.PLAIN_MESSAGE,
					null,
					new Object[] {
							"De Pesos a Dólar",
							"De Pesos a Euro",
							"De Pesos a Libras",
							"De Pesos a Yen",
							"De Pesos a Won Coreano",
							"De Dólar a Pesos",
							"De Euro a Pesos",
							"De Libra a Pesos",
							"De Yen a Pesos",
							"De Won Coreano a Pesos"}, 
					"Conversor de Moneda");
			
			cantidadDeConversion = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir");
			
			while (!Validar.isNumber(cantidadDeConversion)) {
				cantidadDeConversion = JOptionPane.showInputDialog(null,
						"Por favor, ingresa algún valor valido");
			}
			
			double nuevoValor = Double.parseDouble(cantidadDeConversion);
			nuevoValor = Conversiones.convertir(nuevoValor, valores.get(lista.indexOf(valor)));
			
			JOptionPane.showMessageDialog(null, "El valor de la conversión es: $" + nuevoValor);
			
			resp = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
			System.out.println(resp);
		}
		
		JOptionPane.showMessageDialog(null, "Programa finalizado");
	}

}

