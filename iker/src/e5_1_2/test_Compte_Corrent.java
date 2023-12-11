package e5_1_2;

public class test_Compte_Corrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creem una instancia de comptecorrent
		//d'aquesta manera creem un compte corrent i accedim als seus atributs i metodes
		Compte_Corrent iker = new Compte_Corrent("47777777P", "Iker");
		Compte_Corrent sergi = new Compte_Corrent("477353457S", 23.14);
		Compte_Corrent jose = new Compte_Corrent("243346364Q", "Jose", 5.55);

		
		iker.mostrarInformació();
		System.out.println("*****************");
		
		//farem un ingres de 100€
		System.out.println("Ingresam 100€");
		iker.ingressarDiners(100);
		
		//mostram estat actual de la compte
		iker.mostrarInformació();
		System.out.println("*****************");
		
		//retiram 80€
		System.out.println("Mirem de retirar 80€");
		iker.treureDiners(80);
		System.out.println("*****************");

		//mostram estat de la compte corrent
		iker.mostrarInformació();
		System.out.println("*****************");

		//retiram 30€
		System.out.println("Mirem de retirar 30€");
		iker.treureDiners(30);
		System.out.println("*****************");
		System.out.println("*****************");

		sergi.mostrarInformació();
		System.out.println("*****************");
		//farem un ingres de 100€
		sergi.ingressarDiners(100);
		
		//mostram estat actual de la compte
		sergi.mostrarInformació();
		System.out.println("*****************");
		
		//retiram 80€
		System.out.println("Mirem de retirar 80€");
		sergi.treureDiners(80);
		
		//mostram estat de la compte corrent
		sergi.mostrarInformació();
		System.out.println("*****************");

		//retiram 30€
		System.out.println("Mirem de retirar 30€");
		sergi.treureDiners(30);
		System.out.println("*****************");
		System.out.println("*****************");
		
		jose.mostrarInformació();
		System.out.println("*****************");
		
		//farem un ingres de 100€
		System.out.println("Ingresam 100€");
		jose.ingressarDiners(100);
		
		//mostram estat actual de la compte
		jose.mostrarInformació();
		System.out.println("*****************");
		
		//retiram 80€
		System.out.println("Mirem de retirar 80€");
		jose.treureDiners(80);
		System.out.println("*****************");

		//mostram estat de la compte corrent
		jose.mostrarInformació();
		System.out.println("*****************");

		//retiram 30€
		System.out.println("Mirem de retirar 30€");
		jose.treureDiners(30);
		System.out.println("*****************");
		System.out.println("*****************");
	}

}
