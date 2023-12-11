package Arrays;

public class tridimensioonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] matriz = new int[3][4][5]; 				
		
		llenaArrayTridimensional(matriz);
		
		for(int[] padre:matriz) {
			for(int hijo:padre) {
				System.out.println(hijo);
			}
		}
								
	}
	private static void llenaArrayTridimensional(int[][] matriz) {
		for(int i =0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[0].length;j++) { //[0].lenght para saber la lenght del padre 0
				matriz[i][j]=i*j;
				System.out.println(matriz[i][j]);
			}
		}
	}

}
