package Menus;

import javax.swing.JOptionPane;

import Temperatura.EntradaTempe;

public class MenuPrincipal {
	 boolean continuar = true;
	
	public  void mostrarMenu() {
		 
		EntradaValorMoneda valor = new EntradaValorMoneda();
		EntradaTempe tempera = new EntradaTempe();
		String[] opciones = {"Conversor de Moneda", "Conversor de Temperatura"};
		
		while(continuar) {
			String seleccion = (String) JOptionPane.showInputDialog(
					null,
					"Selecciona una opción de conversión:",
					"Menu",
					JOptionPane.PLAIN_MESSAGE,
					null,
					opciones,
					opciones[0]
					);
			
			if (seleccion == null) {
				int respuesta = JOptionPane.showConfirmDialog(
	                    null,
	                    "¿Desea continuar usando el programa?",
	                    "Confirmación",
	                    JOptionPane.YES_NO_OPTION
	            );
				
				if (respuesta == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    break;
                }
			}else if(seleccion == "Conversor de Moneda"){
				valor.mostrarMenu();
			}else if(seleccion == "Conversor de Temperatura") {
				tempera.mostra();
			}
		}
	}

}
