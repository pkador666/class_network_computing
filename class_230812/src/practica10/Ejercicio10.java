package practica10;
import javax.swing.JOptionPane;
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de veces a jugar: "));
		Ejercicio10Clase dado=new Ejercicio10Clase(cantidad);
		String[] juego;
		juego=dado.jugar();
		JOptionPane.showMessageDialog(null, "Se tiro "+cantidad+" veces y resulto:\n"+juego[0]+"Obteniendo "+juego[1]+" caras y "+juego[2]+" sellos" );
	}

}
