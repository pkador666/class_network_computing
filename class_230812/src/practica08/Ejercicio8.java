package practica08;
import javax.swing.JOptionPane;
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		while(true){
			num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
			if (num>2){ break;}
		}
		Ejercicio8Clase ya =new Ejercicio8Clase(num);
		JOptionPane.showMessageDialog(null, "\n"+ya.dibujar());
		
	}

}
