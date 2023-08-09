package Menus;

import javax.swing.JOptionPane;

public class Conversiones {
	
	Continuar continu = new Continuar();
	boolean continuar = true;
	
	public void cambiarmultiplicacion(double valor, double cantidad) {
		float cantidadfinal = 0;
		
		cantidadfinal = (float) (cantidad * valor);
		int respuesta = JOptionPane.showConfirmDialog(null, "Tiene $"+ cantidadfinal +" Dolares"
						, "¿Desea Continuar?", JOptionPane.YES_NO_OPTION);
		
		if (respuesta == JOptionPane.YES_OPTION || respuesta == JOptionPane.NO_OPTION)  {
        	continu.continuar();
        }
		
	}

}
