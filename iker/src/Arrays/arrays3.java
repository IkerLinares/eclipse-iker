package Arrays;

import java.util.Arrays;

public class arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayOrigen = {1,2,3,4,5,6,7,8};
		System.out.println("origen: " + Arrays.toString(arrayOrigen));
		int[] arrDestino = new int[3];
		
		System.arraycopy(arrayOrigen, 2, arrDestino, 0, 3); //copia desde el indice 2(sitio3)
		
		System.out.println("destino: " + Arrays.toString(arrDestino)); //revisamos si va bien
		
		//arraycopy - system
		//copia dos elementos consecutivos entre 2 arrays
		
		//void arrayCopy(object arrayorigen, int posorigen
								//object arrayDestino, int posdestino, int longitud)
		
		//copia arrayDestino, a partir del indice posDestino, los datos del arrayOrigen, 
		//comenzando en el indice posOrigen
		
		//intLongitud indica el numero de elementos que se copiaran
	}

}
