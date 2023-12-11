package Redimensionarray;

import java.util.Arrays;

public class clasearray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {1, 3, 4, -6, 0, 2};
		
		String aux = Arrays.toString(numeros);
		System.out.println(numeros.length);
		System.out.println(aux.length()); //pasado a string suman los caracteres de comas i espacios etc
		
		Arrays.sort(numeros); //para ordenarlo
	}

}
