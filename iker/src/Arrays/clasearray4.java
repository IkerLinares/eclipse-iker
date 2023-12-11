package Redimensionarray;

import java.util.Arrays;

public class clasearray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {9, 2, 4, -5, 0, 3};
		Arrays.sort(numeros);
		int valorbuscado = 4;
		
		int indice = Arrays.binarySearch(numeros, 100);
		
		int posicioninsercion = -indice -1;
		
		System.out.println(indice);
		System.out.println(posicioninsercion);
		
		
	}

}
