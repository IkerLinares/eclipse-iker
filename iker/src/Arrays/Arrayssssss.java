package Java;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayssssss {
	
	public static void main(String[] args) {
		/*Teoria
		 *Una de las coleciones fundamentales en programacion
		 *Coleccion ordenada de elementos del mismo tipo
		 *Puden ser cadenas enteros doubles y otros tipos de datos
		 * Caracteristicas:
		 * Elementos homogeneos:Todos del mismo tipo
		 * Indices:Cada elemento de un array se identifica por un indice, este indice es un entero positivo, primer elemento de un array el 0,1,2...
		 * Son de tamaño fijo 
		 */
		
		//Declaracion de arrays
		//tipoDato [] Nombre del array
		//Inicialicacion directa 
				int[] numeros= {5, 10, -1, 6};
				
				//Inicialicacion indirecta
				
			int[] numeros2=new int [5];
				
				numeros2[0] = 3;
				numeros2[1] = 5;
				numeros2[2] =-5;
				numeros2[3] =23;
				numeros2[4]= 13;
				int prim=numeros [0];
				int otro=numeros2[2];
				//Longitud
				int longitudNum=numeros.length;
		
		//Bucles array
		int[] numeros= {5, 10, -1, 6};
		for(int i= 0; i < numeros.length;i++) {
			
			System.out.println(i+"="+numeros[i]);
		}
		
		//Bucle for each
		int[] numeros= {5, 10, -1, 6};
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		String[]ciudades= {"madrid","barcelona","valencia","es castell"};
		for(String numero:ciudades) {
			System.out.println(numero);
			
		}
		
		//Metodos
		
		//Funciones propias de los arrays 
		
		//clone():Crea una copia del array 
		int[] numeros = {1,2,3,4,5};
		int [] copia=numeros.clone();
		numeros[0]=10;
		
		System.out.println(numeros[0]);
		System.out.println(copia[0]);
		System.out.print(numeros+",");
		System.out.print(copia+",");
		
		//Equals(Objeto o)
		int[] numeros= {1,2,3};
		int[] numeros2= {1,2,3};
	
		boolean sonIguales=Arrays.equals(numeros, numeros2);
		System.out.println(sonIguales);
		
		//toString()
		int[] numeros= {1,2,3};
		String arrayCadena=Arrays.toString(numeros);
		System.out.println(arrayCadena);
	   
		//sort()
		int[] numeros= {5,1,3,4,2};
		System.out.println(Arrays.toString(numeros));
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));		
		
		
		//binarySearch()
		int[] numeros= {1,2,3,4,5};
		String[] cadenas= {"una","dos","tres"};
		int indice=Arrays.binarySearch(numeros, 3);
		System.out.println(indice);		
		
		
		//fill()
		int[] numeros=new int [5];
		Arrays.fill(numeros, 1);
		
		for(int numero:numeros) {
			System.out.println(numero);
		}
		
		//copyOf
		int[] numeros= {1,2,3,4,5};
		int[] copia=Arrays.copyOf(numeros, 3);
		System.out.println(Arrays.toString(copia));
		
		
		//copyOfRange()
		int[] numeros= {1,2,3,4,5};
		int[] copia=Arrays.copyOfRange(numeros, 1,4);
		System.out.println(Arrays.toString(copia));
		
		
		
		
		
		
		
		
		
		
	}
 }