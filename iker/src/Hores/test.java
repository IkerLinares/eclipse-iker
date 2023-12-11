package Hores;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		//inicialitzam scanner
		Scanner sc = new Scanner(System.in);
		
		//cream una hora
		hores hora1  = new hores();
		
		//demanam la hora i amb el setter agafam lo introduit
		System.out.println("Doname la hora");
		int h = sc.nextInt();
		hora1.setHora(h);
		
		//demanam els minuts i amb el setter agafam lo introduit
		System.out.println("Doname els minuts");
		int m = sc.nextInt();
		hora1.setMinut(m);
		
		//demanam els segons i amb el setter agafam lo introduit
		System.out.println("Doname els segons");
		int s = sc.nextInt();
		hora1.setSegon(s);
		
		//demanam el temps i amb el setter agafam lo introduit
		System.out.println("Doname els segons que li sumaras a la nostra hora inicial");
		int t = sc.nextInt();
		hora1.setTemps(t);
		
		//cridam al metode de mostrar la hora que ell ha donat
		hora1.infohora();
		//cridam al metode que suma temps a la hora donada
		hora1.sumarTemps();
		System.out.print("Ara la hora ");
		//i donam el resultat amb la suma
		hora1.infohora();
	}

}
