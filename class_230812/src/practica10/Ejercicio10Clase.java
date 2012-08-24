package practica10;
import java.util.Random;
public class Ejercicio10Clase {

	/*
	 * Simularemos el tiro de la moneda con un variable random
	 * Utilizaremos una variable cantidad; para la cantidad de veces que se tire el dado
	 * Utilizaremos otra variable juego; para almacenar el juego y el resultado;
	 * 
	 * Estructura de Juego
	 * juego[0]=juego en si {"cara","sello","cara","sello",etc}
	 * juego[1]=cantidad_de_caras
	 * juego[2]=cantidad_de_sellos
	 * 0=cara
	 * 1=sello
	 */
	public int cantidad;
	public String juego[]={"","",""};
	public int caras=0,sellos=0;
	public Random r=new Random();
	public int tiro;
	public Ejercicio10Clase(int cantidad){
		this.cantidad=cantidad;
	}
	
	public String[] jugar(){
		for (int i=0;i<this.cantidad;i++){
			tiro=r.nextInt(2);
			if (tiro==0){
				caras+=1;
				juego[0]=juego[0]+"cara\n";
				juego[1]=""+caras;
			}
			else { 
				sellos+=1;
				juego[0]=juego[0]+"sello - "+sellos+"\n";
				juego[2]=""+sellos;
			}
		}
		return juego;
	}
}
