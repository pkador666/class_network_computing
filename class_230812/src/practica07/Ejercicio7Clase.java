package practica07;


public class Ejercicio7Clase {

	public int n;
	String serie="";
	int suma=0;
	int aux=-1;
	int anterior=1;
	public Ejercicio7Clase(int num){
		this.n=num;
	}
	public String fibonacci(){
		if (this.n>0) {
			suma=aux+anterior;
			serie=serie+","+suma;
			aux=anterior;
			anterior=suma;
			this.n--;
			return fibonacci();
		} else {
			return serie; }
		/*
		 *  0, 1, 1, 2, 3, 5, 8, 13, 21
		 * 
		 */
	}
}
