package ecuació_segon_grau;
import java.util.Scanner;
public class Calcula_ecuació_segon_grau {

	int a;
	int b;
	int c;
	int resultats;
	double arrel;
	
	Calcula_ecuació_segon_grau(int a, int b, int c){
		
		this.a = a;
		this.b = b;
		this.c = c;		
	}
	
	void arrel() {
		arrel = (this.b*this.b) - 4 * (this.a * this.c);
		Math.sqrt(arrel);
		
	}
	
	void resultats() {
		double x1;
		double x2;
		
		if(this.arrel == 0) {
			x1 = (-b)/(a*2);
			System.out.println("El resultat de la ecuació es de: " + x1);
		}
		else if(this.arrel > 0) {
			x1 = (b+arrel)/(a*2);
			x2 = (b-arrel)/(a*2);
			System.out.println("En aquest cas te dos reultats: " + x1 + "\n i tambe te el resultat calculant en negatiu que dona: " + x2);
		}
		else {
			System.out.println("No es pot resoldre amb les variables obtingudas");
		}
	}
}
