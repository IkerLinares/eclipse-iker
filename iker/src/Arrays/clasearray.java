package Redimensionarray;
public class clasearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[10];
		
	//	Arrays.fill(numeros, 2); //todos los espacios son 2
	
	//	Arrays.fill(numeros, 3, 7, 5); //rellena els espais 3, 4, 5 i 6
		
	//	Arrays.fill(numeros, 0, 5, 5); // rellenas con cincos todos menos la posocion 5
	//	Arrays.fill(numeros, 6, numeros.length, 5);
						
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}

}
