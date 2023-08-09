package Menus;

import javax.swing.JOptionPane;

public class Continuar {
	boolean continuar2 = true;
	
	public void continuar() {
		MenuPrincipal menupri = new MenuPrincipal();
		
		int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Desea continuar usando el programa?",
                "Confirmación",
                JOptionPane.YES_NO_CANCEL_OPTION
            );

            if (respuesta == JOptionPane.NO_OPTION || respuesta == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                continuar2 = false;
            }else if (respuesta == JOptionPane.YES_OPTION){
            	menupri.mostrarMenu();
            }
	}

}
