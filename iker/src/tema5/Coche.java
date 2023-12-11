package tema5;
import java.util.Scanner;
public class Coche {

	String marca;
	boolean operatiu;
	double caballs;
	
	public void avansar() {
		System.out.println("El coche esta en marcha cap envant");
	}
	
	public void marchaenrere() {
		Scanner sc = new Scanner(System.in);
		int enrera;
		System.out.println("Cuants metres has fet marcha enrera?");
		enrera = sc.nextInt();
		if(enrera>2) {
			System.out.println("No es pot fer 2 metres marcha enrera");
		}else {
			System.out.println("Has anat " + enrera + " metres cap enrera");
		}
	}

	public void itv() {
		if(operatiu == true) {
			System.out.println("El cotxe ha pasat la ITV");
		}else {
			System.out.println("El cotxe no ha pasat la ITV");
		}
	}
	
	public void marca() {
		System.out.println("La teva marca es: " + marca);
	}
	
	public void cavalls() {
		Scanner sc = new Scanner(System.in);
		int cavalls;
		System.out.println("Cuants caballs te el teu cotche?");
		cavalls = sc.nextInt();
		System.out.println("El teu cotche te: " + cavalls + "cavalls");
	}
	
	Coche(String marca, boolean operatiu, double caballs){
		this.marca = marca;
		marca();
		
		this.operatiu = operatiu;
		itv();
		
		this.caballs = caballs;
		cavalls();
	}
	
	Coche(String marca){
		this.marca = marca;
		marca();
	}

	Coche(boolean operatiu){
		this.operatiu = operatiu;
		itv();
	}

	Coche(double caballs){
		this.caballs = caballs;
		cavalls();
	}
}
