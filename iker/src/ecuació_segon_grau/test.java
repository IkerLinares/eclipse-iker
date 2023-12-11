package ecuació_segon_grau;
import java.util.*;
public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Doname el nombre A per a la equació");
		int a = sc.nextInt();
		if(a <= 0) {
			System.out.println("No es pot calcular amb a = 0");
		}else {
			
		System.out.println("Doname el nombre B per a la equació");
		int b = sc.nextInt();
		System.out.println("Doname el nombre C per a la equació");
		int c = sc.nextInt();
		
		Calcula_ecuació_segon_grau primer = new Calcula_ecuació_segon_grau(a,b,c);
			primer.arrel();
			primer.resultats();
		}
	}

}
