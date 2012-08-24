package practica04;

import javax.swing.JOptionPane;

import practica04.Ejercicio4Clase;

public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio;
		radio=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el radio: "));
		Ejercicio4Clase obtener=new Ejercicio4Clase(radio);
		JOptionPane.showMessageDialog(null, "El area es: "+obtener.area());
	}

}
