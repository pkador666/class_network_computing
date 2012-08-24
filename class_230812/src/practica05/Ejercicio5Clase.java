package practica05;

public class Ejercicio5Clase {

	public double n1;
	public double n2;
	public Ejercicio5Clase(double num1,double num2){
		this.n1=num1;
		this.n2=num2;
	}
	/*
	 * 
	 * Ojo el primer numero debe ser menor
	 * 
	 */
	public String multiplo(){
		if (n2%n1==0) {
		return "Es multiplo";
		} else {
			return "No es multplo";
		}
	}
}
