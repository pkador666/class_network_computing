package practica03;
import javax.swing.JOptionPane;
public class Ejercicio3 {

	public static void main(String[] args) {
		String nombre=JOptionPane.showInputDialog("Ingrese su nombre: ");
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
		String ciudad=JOptionPane.showInputDialog("Ingrese su ciudad: ");
		Ejercicio3Clase Mensaje=new Ejercicio3Clase(nombre,edad,ciudad);
		JOptionPane.showMessageDialog(null,Mensaje.saludo());
	}
}
