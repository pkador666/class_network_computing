package practica02;
import javax.swing.JOptionPane;
public class Ejercicio2 {

	public static void main(String[] args){
		int numero1;
		int numero2;
		numero1=Integer.parseInt(JOptionPane.showInputDialog("INgrese numero 1: "));
		numero2=Integer.parseInt(JOptionPane.showInputDialog("INgrese numero 2: "));
		Ejercicio2Clase Operacion=new Ejercicio2Clase(numero1,numero2);
		JOptionPane.showMessageDialog(null, "La suma es: "+Operacion.Suma(), "Resultado", JOptionPane.PLAIN_MESSAGE);
		
	}
}
