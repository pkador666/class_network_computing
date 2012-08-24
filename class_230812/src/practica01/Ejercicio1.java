package practica01;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args){
		String nombrex="";
		nombrex=JOptionPane.showInputDialog("Ingrese su nombre");
		Ejercicio1Clase Inicio=new Ejercicio1Clase(nombrex);
		Inicio.Bienvenida();
	}
}
