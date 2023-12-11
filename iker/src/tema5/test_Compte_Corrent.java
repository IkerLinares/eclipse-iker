package tema5;

public class test_Compte_Corrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creem una instancia de comptecorrent
		//d'aquesta manera creem un compte corrent i accedim als seus atributs i metodes
		Compte_Corrent iker = new Compte_Corrent("47777777P", "Iker");
		iker.mostrarInformació();
		
		//farem un ingres de 100€
		iker.ingressarDiners(100);
		
		//mostram estat actual de la compte
		iker.mostrarInformació();
		
		//retiram 80€
		System.out.println("Mirem de retirar 80€");
		iker.treureDiners(80);
		
		//mostram estat de la compte corrent
		iker.mostrarInformació();
		
		//retiram 30€
		System.out.println("Mirem de retirar 30€");
		iker.treureDiners(30);
	}

}
