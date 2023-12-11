package Compte_corrent_4;

public class test_Compte_Corrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creem una instancia de comptecorrent
		//d'aquesta manera creem un compte corrent i accedim als seus atributs i metodes
		Compte_Corrent iker = new Compte_Corrent("47777777P", "Iker");
		
		Compte_Corrent ej4 = new Compte_Corrent("124235i", "Ejer 4");
		
		//feim els syso per veure els noms de antes
		System.out.println(ej4.getNombanc());
		System.out.println(iker.getNombanc());
		
		//Cambiam el nom amb el getter
		Compte_Corrent.setNombanc("Nom final");

		//mostram el nom final
		System.out.println(ej4.getNombanc());
		System.out.println(iker.getNombanc());
	}

}
