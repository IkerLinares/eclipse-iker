package tema5;

public class Persona {

	//Atributos o propiedades
	String nombre;
	int edad;
	double altura;
	
	Persona(){
		this.nombre
	}
	
	Persona(){
		this.nombre = "No asignado";
		this.edad = -1;
		this.altura = -2;
	}
	
	Persona(String nombre, int edad,double altura ){
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	//Metodos
	public void saludar() {
		System.out.println("Hola");
	}
	
	public void caminar() {
		System.out.println("Estoy caminando");
	}
	
	public void cumpleAnyos() {
		edad++;
	}
	
	public static void dilala() {
		System.out.println("lala");
	}
}
