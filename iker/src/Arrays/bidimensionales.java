package Arrays;

public class bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[3][4]; //cada hueco de la primera array tiene 4 huecos dentro
		matriz[0][0] = 65;
		matriz[0][1] = 5;
		matriz[0][2] = -6;// de la otra manera se declararia {{1,2,3,4}, {12,34,55,66}} etc
		matriz[0][3] = 90;
		int[] mono = matriz[0]; //coje solo la posicion grande 0
		
		System.out.println(matriz[0][0]); //poner mono[0] mostraria lo mismo
	}

}
