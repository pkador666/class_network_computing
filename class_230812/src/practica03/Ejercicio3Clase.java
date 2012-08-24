package practica03;

public class Ejercicio3Clase {

	public String nombre;
	public int edad;
	public String ciudad;
	
	public Ejercicio3Clase(String nombre,int edad, String ciudad) {
		this.nombre=nombre;
		this.edad=edad;
		this.ciudad=ciudad;
	}
	public String saludo() {
		return "Mi nombre es "+nombre+" tengo "+edad+" anos y vivo en "+ciudad;
	}
}
