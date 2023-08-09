package Menus;

import javax.swing.JOptionPane;

public class MenuCambiosMoneda {
	
	public void mostrarMenu(int cantidad) {

		boolean continuar = true;
		MenuPrincipal menupri = new MenuPrincipal();
		Conversiones  conversion = new Conversiones();
		
		String[] cambios = {"Peso a Dolar", "Peso a Euro", "Peso a Libra Esterlina",
							"Peso a Yen Japonés", "Peso a Won sul-coreano",
							"Dolar a peso", "Euros a Peso", "Libra Esterlina a Peso",
							"Yen Japonés a Peso", "Won sul-coreano a Peso"};		
		
		while(continuar) {
			String seleccion = (String) JOptionPane.showInputDialog(
					null,
					"Selecciona una opción de conversión:",
					"Menu",
					JOptionPane.PLAIN_MESSAGE,
					null,
					cambios,
					cambios[0]
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
	                continuar = false;
	            }else if (respuesta == JOptionPane.YES_OPTION){
	            	menupri.mostrarMenu();
	            }
			}else if(seleccion == "Peso a Dolar") {
				double valor = 0.058;
				conversion.cambiarmultiplicacion(valor, cantidad);
			}else if(seleccion == "Peso a Euro") {
				double valor = 0.053;
				conversion.cambiarmultiplicacion(valor, cantidad);
			}else if(seleccion == "Peso a Libra Esterlina") {
				double valor = 0.046;
				conversion.cambiarmultiplicacion(valor, cantidad);
			}else if(seleccion == "Peso a Yen Japonés") {
				double valor = 8.38;
				conversion.cambiarmultiplicacion(valor, cantidad);
			}else if(seleccion == "Peso a Won sul-coreano") {
				double valor = 76.92;
				conversion.cambiarmultiplicacion(valor, cantidad);
			}else if(seleccion == "Dolar a peso") {
				double valor = 17.10;
				conversion.cambiarmultiplicacion(valor, cantidad);
			}else if(seleccion == "Euros a Peso") {
				double valor = 18.80;
				conversion.cambiarmultiplicacion(valor, cantidad);
			}else if(seleccion == "Libra Esterlina a Peso") {
				double valor = 21.83;
				conversion.cambiarmultiplicacion(valor, cantidad);
			}else if(seleccion == "Yen Japonés a Peso") {
				double valor = 0.012;
				conversion.cambiarmultiplicacion(valor, cantidad);
			}else if(seleccion == "Won sul-coreano a Peso") {
				double valor = 0.013;
				conversion.cambiarmultiplicacion(valor, cantidad);
			}
			
		}
		
	}

}
