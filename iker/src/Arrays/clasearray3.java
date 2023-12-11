package Redimensionarray;

public class clasearray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {1, 3, 4, -6, 0, 2};

		int valorbuscado = 4;
		int indicebuscado = 0;
		int indice = -1;
		
		for(int i = 0;i<numeros.length; i++) {
			if(numeros[i] == valorbuscado) {
				indice = i;
				break;
			}
		}
		
		System.out.println("El indice del valor " + valorbuscado + " en el array es " + indice);
		
		devolversegundovalor();
		
	}
	public static void devolversegundovalor(int i, int valorbuscado, int indice, int[] numeros){
		
		for( i = numeros.length -1;i>=0; i--) { //buscamos el numero buscando por atras para cojer el ultimo
			if(numeros[i] == valorbuscado) {
				indice = i;
				break;
			}
		}
		if(indice == 1) {
			System.out.println("El valor " + valorbuscado + " no se encuentra en el array.");
		}else {
			System.out.println("El indice del valor " + valorbuscado + " en el array es " + indice);
		}
}
	public static void devolversegundovalorconwhile(int i, int valorbuscado, int indicebuscado, int[] numeros) {
		
		while(indicebuscado < numeros.length && numeros[indicebuscado] != valorbuscado) {
			indicebuscado++;
		}
		if(indicebuscado < numeros.length) {
			System.out.println("El indice del valor " + valorbuscado + " en el array es " + indicebuscado);
		}else {
			System.out.println("El valor " + valorbuscado + " no se encuentra en el array.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}