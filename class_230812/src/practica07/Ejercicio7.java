package practica07;
import javax.swing.JOptionPane;
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
		Ejercicio7Clase obtener=new Ejercicio7Clase(num);
		JOptionPane.showMessageDialog(null, "La serie es: "+obtener.fibonacci());
	}

}
