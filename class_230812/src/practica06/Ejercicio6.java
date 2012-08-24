package practica06;
import javax.swing.JOptionPane;
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero:"));
		Ejercicio6Clase obtener=new Ejercicio6Clase(num);
		JOptionPane.showMessageDialog(null,"EL factorial de "+num+"numero es: "+obtener.factorial());
	}

}
