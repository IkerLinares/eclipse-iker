package Redimensionarray;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] apuesta = {1,2,3,4,5,6,7,8,9,10}; //cuantos numeros se repiten entre los 2 arrays
		int[] ganadora = {1,3,5,7,8,0,12,33,44,55};
		int contador = 0;
		
	
		
		System.out.println("Apuesta: " + Arrays.toString(apuesta));
		System.out.println("Apuesta ganadora " + Arrays.toString(ganadora));
	}
	
	public static int sercarnombresiguals(int[]apuesta, int[]ganadora) {
																						
		int numeroaciertos = 0;
		for (int comb : apuesta) {
			if(Arrays.binarySearch(ganadora, comb) >=0) { //si esta dentro de las posiciones del array
			}
			}
		return numeroaciertos;	
		}
	}
