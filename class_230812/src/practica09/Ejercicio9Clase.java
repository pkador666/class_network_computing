package practica09;

public class Ejercicio9Clase {

	public int cantidad[];
	
	public Ejercicio9Clase(int[] cantidad){
		this.cantidad=cantidad;
	}
	public int hallarPares(){
		int pares=0;
		for (int i=0;i<this.cantidad.length;i++){
			if(cantidad[i]%2==0){ pares+=1;	}
		}
		return pares;
				
	}
}
