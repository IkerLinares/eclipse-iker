package Funcions;
import java.util.Scanner;
public class Funcions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		//Declaramos dos variables una para la base i el otro el exponente
		int num;
		int exp;
		//Preguntamos i escanemos la base i el exponente
		System.out.println("Doneme un numero real");
		num = sc.nextInt();
		System.out.println("Doneme un numero que seran les vegades que es multiplicara el numero anterior");
		exp = sc.nextInt();
		//LLamamos a las dos funciones i las imprimimos
		System.out.println("Ierativa = " + iterativa(num,exp));
		System.out.println("Recursiva = " +recursiva(num,exp));
		int suma = iterativa(num,exp) + recursiva(num,exp);
		System.out.println(suma);
		}
		
		public static int iterativa(int num,int exp) {
		int resultat = 0;
		int numaux = num;
		for(int i = 1; i != exp; i++) {
			
			resultat = num * numaux;
			num = resultat;
		}
		return resultat;
		}
		
		public static int recursiva(int num,int exp) {
			
		if(exp == 0) {
		return 1;
		}else {

		
		}
		return num * recursiva(num, exp-1);
		}

	}
