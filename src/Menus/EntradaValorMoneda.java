package Menus;

import javax.swing.JOptionPane;

public class EntradaValorMoneda {
	
	boolean continuar = true;
	
	public void mostrarMenu() {
		
		MenuCambiosMoneda menucambios = new MenuCambiosMoneda();
		
		while(continuar) {
			
			String cantidadStr = (String) JOptionPane.showInputDialog(
					null,
					"Ingrese la cantidad a convertir:",
					"Input",
					JOptionPane.PLAIN_MESSAGE
					);
			try {
	            Integer.parseInt(cantidadStr);
	        } catch (NumberFormatException e) {
	        	int respuesta = JOptionPane.showConfirmDialog(
	                    null,
	                    "Sólo numeros. \nDesea volver a intentar ingresar \n \tun numero.",
	                    "Confirmación",
	                    JOptionPane.YES_NO_OPTION
	            );
				
				if (respuesta == JOptionPane.YES_OPTION) {
                    mostrarMenu();
                }
	        }
		
			if (cantidadStr == null) {
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
			}else{
				int cantidad = Integer.parseInt(cantidadStr);
				menucambios.mostrarMenu(cantidad);
			}
		}
	}

}
