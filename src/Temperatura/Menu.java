package Temperatura;

import javax.swing.JOptionPane;

import Menus.Continuar;
import Menus.MenuPrincipal;

public class Menu {
	
	 boolean continuar = true;
	
	public void menuTempe(int cantidad) {
		boolean continuar = true;
		MenuPrincipal menupri = new MenuPrincipal();
		Continuar continu = new Continuar();
		
		String[] cambios = {"Fahrenheit a Celsius", "Celsius a Fahrenheit",
							"Fahrenheit a Kelvin", "Kelvin a Fahrenheit"};		
		
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
			}else if(seleccion == "Fahrenheit a Celsius") {
				double c = (cantidad - 32 )/1.8;
				int respuesta = JOptionPane.showConfirmDialog(null, "Tiene $"+ c +" Celsius"
						, "¿Desea Continuar?", JOptionPane.YES_NO_OPTION);
		
				if (respuesta == JOptionPane.YES_OPTION || respuesta == JOptionPane.NO_OPTION)  {
					continu.continuar();
				}
			}else if(seleccion == "Celsius a Fahrenheit") {
				double f = (cantidad * 1.8 )+32;
				int respuesta = JOptionPane.showConfirmDialog(null, "Tiene $"+ f +" Fahrenheits"
						, "¿Desea Continuar?", JOptionPane.YES_NO_OPTION);
		
				if (respuesta == JOptionPane.YES_OPTION || respuesta == JOptionPane.NO_OPTION)  {
					continu.continuar();
				}
			}else if(seleccion == "Fahrenheit a Kelvin") {
				double k = (cantidad + 459.67 )/1.8;
				int respuesta = JOptionPane.showConfirmDialog(null, "Tiene $"+ k +" Kelvin"
						, "¿Desea Continuar?", JOptionPane.YES_NO_OPTION);
		
				if (respuesta == JOptionPane.YES_OPTION || respuesta == JOptionPane.NO_OPTION)  {
					continu.continuar();
				}
			}else if(seleccion == "Kelvin a Fahrenheit") {
				double fk = (cantidad * (9/5) ) - 459.67;
				int respuesta = JOptionPane.showConfirmDialog(null, "Tiene $"+ fk +" Fahrenheits"
						, "¿Desea Continuar?", JOptionPane.YES_NO_OPTION);
		
				if (respuesta == JOptionPane.YES_OPTION || respuesta == JOptionPane.NO_OPTION)  {
					continu.continuar();
				}
			}
		}
	}

}
