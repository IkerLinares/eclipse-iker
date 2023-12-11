package constructors;

public class Animales {

	String especie;
	int patas;
	boolean mamimero;
	
	Animales(String especie, int patas, boolean mamifero){
		this.especie = especie;
		this.patas = patas;
		this.mamimero = mamifero;
	}
	
	Animales(String especie, int patas){
		this.especie = especie;
		this.patas = patas;
		this.mamimero = true;
	}
	
	Animales(boolean mamifero){
		this("Humano", 2, mamifero);
	}
	
	public void muestraInfo(){
		System.out.println("Especie: " + this.especie);
		System.out.println("Patas: " + this.patas);
		System.out.println("Mamifero: " + this.mamimero);

	}
}
