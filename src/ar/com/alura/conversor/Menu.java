package ar.com.alura.conversor;

import java.util.List;
import javax.swing.JOptionPane;

import ar.com.alura.conversor.modelo.Modelo;
import ar.com.alura.conversor.validar.*;

public class Menu {
	public static void main(String[] args) {
		
		int resp = 0;
		
		while(resp == 0) {	
			String cantidadDeConversion;
			List<String> tipoDeConversion = Modelo.tipoDeConversion();

			Object respuesta = JOptionPane.showInputDialog(null,
					"Seleccione una opcion de conversion",
					"Menu",
					JOptionPane.PLAIN_MESSAGE,
					null,
					new Object[] {"Conversor de Moneda",
							"Conversor de Temperatura"},
					"Conversor de Moneda");
			
			
			

			switch(tipoDeConversion.indexOf(respuesta)) {
			case 0:
				
				List<Double> listarValores = Modelo.listarValores();
				List<String> listarTipo = Modelo.listarTipo();
				
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
				nuevoValor = Conversiones.convertir(nuevoValor, listarValores.get(listarTipo.indexOf(valor)));
			
				JOptionPane.showMessageDialog(null, "El valor de la conversión es: $" + nuevoValor);
				
				break;
			case 1:
				
				List<String> listarTipo2 = Modelo.listarTipo2();
				
				Object valor2 = JOptionPane.showInputDialog(null,
						"Elije la temperatura a la que deseas convertir",
						"Temperatura", 
						JOptionPane.PLAIN_MESSAGE,
						null,
						new Object[] {
								"De Celsius a Fahrenheit",
								"De Celsius a Kelvin",
								"De Fahrenheit a Celsius",
								"De Fahrenheit a Kelvin",
								"De Kelvin a Celsius",
								"De Kelvin a Fahrenheit"}, 
						"Conversor de Temperatura");
				
				
				cantidadDeConversion = JOptionPane.showInputDialog("Ingrese la cantidad de temperatura que deseas convertir");
				while (!Validar.isNumber(cantidadDeConversion)) {
					cantidadDeConversion = JOptionPane.showInputDialog(null,
							"Por favor, ingresa algún valor valido");
				}
				
				double nuevoValor2 = Double.parseDouble(cantidadDeConversion);
				
				double valorConvertido = Conversiones.convertidor(listarTipo2.indexOf(valor2), nuevoValor2);
				JOptionPane.showMessageDialog(null, "El valor de la conversión es: " + valorConvertido);
				
				break;
			}

			resp = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
		}
		
		JOptionPane.showMessageDialog(null, "Programa finalizado");
	}

}