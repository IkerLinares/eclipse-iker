package Redimensionarray;

public class RedimensionArray {

	public static void main(String[] args) {
		
	int[] original = new int[5];
	original[0] = 32;
	original[1] = -7;
	original[2] = 0;
	original[3] = 3;
	original[4] = 2;


	System.out.println("Longitud original: " + original.length);
	
	original = redimensionArray(original, original.length + 1);
	
	System.out.println("Longitud original: " + original.length);
	original[5] = 1000;
	System.out.println(original[5]);
	
	for(int numero : original) { //numero es cada uno nde los elementos de la array
		System.out.println(numero);
	}
	
	
	
	}

	private static int[] redimensionArray(int[] original, int nuevaLongitud) {
		int[] nuevoArray = new int[nuevaLongitud];
		
		for (int i = 0; i<original.length; i++) {
			nuevoArray[i] = original[i];
		}
		
		
		
		return nuevoArray;
	}
}
