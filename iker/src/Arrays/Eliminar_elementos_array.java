package Arrays;

import java.util.Arrays;

public class Eliminar_elementos_array {

	public static void main(String[] args) {

		int[] numeros = {3,12,22,-243,14,-1,98};
		int[] nuevoarray = new int[numeros.length -1];
		int valoraeliminar = 3;
		int indiceaeliminar = -1;
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros [i] == valoraeliminar){
				indiceaeliminar = i;
				break;
			}
		}
		
		if(indiceaeliminar!=-1) {
			System.arraycopy(numeros, 0, nuevoarray, 0, indiceaeliminar);
			System.arraycopy(numeros, indiceaeliminar +1, nuevoarray, indiceaeliminar, numeros.length - indiceaeliminar -1);
		}
		
		System.out.println(Arrays.toString(nuevoarray)); //tenemos sin el 3
		

	}

}
