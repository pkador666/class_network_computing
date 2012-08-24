package practica06;

public class Ejercicio6Clase {

	public double n;
	public Ejercicio6Clase(double num){
		this.n=num;
	}
	public double factorial(){
		double fact=1;
		for (int i=1;i<n;i++){
			fact=fact*i;
		}
		return fact;
	}
}
