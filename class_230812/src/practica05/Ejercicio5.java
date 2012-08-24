package practica05;
import javax.swing.JOptionPane;
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero menor"));
		double num2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero mayor"));
		Ejercicio5Clase Obtener=new Ejercicio5Clase(num1,num2);
		JOptionPane.showMessageDialog(null, Obtener.multiplo());
	}

}
