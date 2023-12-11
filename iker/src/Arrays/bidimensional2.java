package Arrays;

public class bidimensional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[3][4]; 
		
		
		
		llenaArrayBidimensional(matriz);
		
		for(int[] padre:matriz) {
			for(int hijo:padre) {
				System.out.println(hijo);
			}
		}
								
	}
	private static void llenaArrayBidimensional(int[][] matriz) {
		for(int i =0;i<3;i++) {
			for(int j = 0;j<4;j++) {
				matriz[i][j]=i*j;
				System.out.println(matriz[i][j]);
			}
		}
	}

}
