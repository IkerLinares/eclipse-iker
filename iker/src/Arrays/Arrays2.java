package Java;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaración de variables.
    	int cantidadPersonajes = 0;
    	String aux = "";
    	
    	// Inicialitzam scanner per emprarlo
        Scanner sc = new Scanner(System.in);
        
        // Presentamos la aplicación.
        System.out.println("----------------------------------------------------------------");
        System.out.println("Programa que guarda noms i els coloca de menor a major longitud");
        System.out.println("---------------------------------------------------------------- \n");
        
        // Demanam cuants noms vol posar
        System.out.println("Cuants personatges vols posar?");
        cantidadPersonajes = sc.nextInt();              

        // Cream array amb la cantitat de personatges que ha donat l'usuari
        String[] personatges = new String[cantidadPersonajes];

        // Anam añadint noms al array a mesura que demanam
        for (int i = 0; i < cantidadPersonajes; i++) {
        	
        	// montam el mensatje
        	aux = "Escribe el nombre del " + (i + 1);  
        	
        	//posam les lletres per fer el posicionament = 1r, 2n, 3r etc
        	aux += switch(i) {
        		case 0 -> "r";
        		case 1 -> "n";
        		case 2 -> "r";
        		case 3 -> "t";
        		default -> "é";
        	};
        	
        	aux += " personaje: ";
        	
        	// Mostram el mensatge.
            System.out.print(aux);
            // Guardam el nom
            personatges[i] = sc.next();
        }

        // Guarda array segons la longitud, de menor a major.
        //Arrays.sort(personajes, (a, b) -> a.length() - b.length());
        personatges = Arrayordenadomenoramayor(personatges);

        // Mostram el resultat ordenat
        System.out.println("Personajes ordenados por longitud de nombre: \n");
        for (String personaje : personatges) {
            System.out.println(personaje);
        }
    }
    
    private static String[] Arrayordenadomenoramayor(String[] personatges) {

    	for (int i = 0; i < personatges.length - 1; i++){
    	    for (int j = 0; j < personatges.length - i - 1; j++){
    	        if (personatges[j].length() > personatges[j+1].length()){
    	            String aux = personatges[j]; 
    	            personatges[j] = personatges[j+1]; 
    	            personatges[j+1] = aux; 
    	        }
    	    }
    	}
    	
    	return personatges;
	}

}
