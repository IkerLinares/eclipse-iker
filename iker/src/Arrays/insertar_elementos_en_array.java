package Arrays;

import java.util.Arrays;

public class insertar_elementos_en_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayOriginal = {11,-2,0,24,145,-6,-57,8};
		Arrays.sort(arrayOriginal);
		System.out.println("origen: " + Arrays.toString(arrayOriginal));
		
		int valornumero = 7;
		int indicedeinsercion;
		
		indicedeinsercion = Arrays.binarySearch(arrayOriginal, valornumero);
		
		if(indicedeinsercion<0) {
			indicedeinsercion = -(indicedeinsercion + 1);
		}
		
		int[] nuevoArray = Arrays.copyOf(arrayOriginal, arrayOriginal.length + 1);
		
		System.out.println("indice de inserción real: " + indicedeinsercion);
		
		System.arraycopy(arrayOriginal, indicedeinsercion, nuevoArray, indicedeinsercion +1, arrayOriginal.length - indicedeinsercion);
		
		nuevoArray[indicedeinsercion] = valornumero;
		
		System.out.println(Arrays.toString(nuevoArray));
		System.out.println(nuevoArray);
	}

	private static int[] sinRepetidos(int[] t) {
		
		int[] temporal = new int[0];
		for(int elemento:t) { //recorremos la array
			if (!buscar(temporal, elemento)) { //si es diferente a la funcion buscar
				temporal = Arrays.copyOf(temporal, temporal.length +1);
				temporal[temporal.length -1] = elemento;
				
			}
		}
		
		return temporal;
	}
	
	private static boolean buscar(int[] t, int valorBuscado) {
		
		boolean encontrado = false;
		
		for(int i=0;i<t.length;i++) {
			if(t[i] == valorBuscado) {
				encontrado = true;
				break;
			}
		}
		
		return encontrado;
	}
}
