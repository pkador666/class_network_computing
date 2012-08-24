package practica08;

public class Ejercicio8Clase {

	public int n;
	public Ejercicio8Clase(int num){
		this.n=num;
	}
	public String dibujar(){
		/*
		 * Dibujando una C invertida 
		 */
		String dibujo="";
		for (int i=0;i<this.n;i++){
			if (i==0 || i==this.n-1) {	
				for (int j=0;j<this.n;j++){
				dibujo=dibujo+"*";
				}
				dibujo+="\n";
			}
			else {
				for (int j=0;j<this.n+1;j++){
					dibujo=dibujo+" ";
				}
				dibujo=dibujo+"*\n";
			}
		}
		return dibujo;
	}

}
