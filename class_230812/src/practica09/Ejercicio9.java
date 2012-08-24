package practica09;
import javax.swing.JOptionPane;
public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de numeros: "));
		int[] contenedor=new int[cantidad];
		for (int i=0;i<cantidad;i++){
			contenedor[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+(i+1)+": "));
		}
		Ejercicio9Clase numero=new Ejercicio9Clase(contenedor);
		JOptionPane.showMessageDialog(null, "Hay "+numero.hallarPares()+" numeros pares");
	}

}
