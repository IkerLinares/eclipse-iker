package Java;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inicialitzam scanner i varibles
		Scanner sc = new Scanner(System.in);
		String nombre;
		boolean si=false;
		//Declaram array
		String[] personas= {"Luke Skywalker", "Darth Vader" , "Princesa Leia", "Han solo", "Yoda"};
		
		//Demanam un nom i el gurdam
		System.out.println("Doname un nom de star wars per saber si esta en la array");
		nombre = sc.nextLine();
		
		//Feim bucle for each
		for (String numero : personas) { //lee todas las strings del array
			if(nombre.equals(numero)) { //si la string demanada es igual a la string es true
				si=true;
				break;
			}else { //sino es false
				si=false;
			}
		}
		if(si==true) { //si es true mostra que si esta en la llista
			System.out.println("Esta en la lista");
		}else {
			System.out.println("No esta en la lista");// si no es true no esta en la llista
		}
	}
}
