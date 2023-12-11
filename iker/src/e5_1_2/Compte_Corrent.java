package e5_1_2;
import java.util.Scanner;
public class Compte_Corrent {

	//Propietats, atributs
	String dni;
	public String nom;
	private double saldo;
	
	//constructors
	Compte_Corrent(String dni, String nom){
		this.dni = dni;
		this.nom = nom;
		this.saldo = 0;
	}
	
	Compte_Corrent(String dni, double saldo){
		this.nom = "sergi";
		this.dni = dni;
		this.saldo = saldo;
	}
	
	Compte_Corrent(String dni, String nom, double saldo){
		this.dni = dni;
		this.nom = nom;
		this.saldo = saldo;
	}
	
	public void crearCompte() {
		System.out.println("El teu nom es: " + nom);
		System.out.println("El teu DNI es: " + dni);
		System.out.println("El teu sou ara mateix es de " + saldo + "€\n*******************");
	}
	
	//metode treure diners
	public void treureDiners(double sacar) {
		if(sacar<=this.saldo) {
			this.saldo = saldo - sacar;
			System.out.println("Operación finalizada\nSaldo actual: " + this.saldo);

		}else {
			System.out.println("Error no tens saldo suficient\nSaldo actual: " + this.saldo);
		}
	}
	
	public void ingressarDiners(double entrar) {
		this.saldo += entrar;
	}
	
	public void mostrarInformació() {
		System.out.println("DNI : "  +this.dni);
		System.out.println("Nom : " +this.nom);
		System.out.println("Sou : " + this.saldo);
	}
}
