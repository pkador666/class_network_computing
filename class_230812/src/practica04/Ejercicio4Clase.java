package practica04;

public class Ejercicio4Clase {

	public double radio;
	
	public Ejercicio4Clase(double radio) {
		this.radio=radio;
	}
	public double area() {
		double area=Math.PI*Math.pow(radio, 2);
		return area;
	}
}
