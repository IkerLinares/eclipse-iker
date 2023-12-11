package Arrays;

import java.util.Arrays;

public class insertar_elementos_en_array_ordenada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {-4,-1,0,2,11,145,666,1000};
		int valoraeliminar = 11;
		int indiceaeliminar = Arrays.binarySearch(numeros, valoraeliminar);
		
		System.out.println("indice a eliminar: " + indiceaeliminar); //numero 11 (p4)
		
		if(indiceaeliminar<0) {
			indiceaeliminar = (indiceaeliminar + 1);
			System.out.println("indice a insertar: " + indiceaeliminar);
		}else {
			int[] nuevoarray = new int[numeros.length -1]; //como quitamos 1 caracter es de 1 menos
			System.arraycopy(numeros, 0, nuevoarray, 0, indiceaeliminar);
			System.arraycopy(numeros, indiceaeliminar +1, nuevoarray, indiceaeliminar, nuevoarray.length - indiceaeliminar);
			System.out.println("nuevoArray: " + Arrays.toString(nuevoarray));
		}
		
		
		

	}

}
