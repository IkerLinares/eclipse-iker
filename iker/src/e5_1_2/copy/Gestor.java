package e5_1_2.copy;

public class Gestor {

	//cream els atributs del gestor
	public String nom;
	private String telefon;
	double maximAutoritzat  = 10000;
	
	//cream constructor perque gestor sempre te un nom i telefon
	Gestor(String nom, String telefon){
		this.nom = nom;
		this.telefon = telefon;
	}

	//sense set perque la gent el pot veure pero no el poden cambiar
	public String getTelefon() {
		return telefon;
	}
	
	void GestorInfo(){
		System.out.println("Nom del gestor: " + this.nom);
		System.out.println("Telefon del gestor: " + this.telefon);
		System.out.println("L'import maxim autoritzat per aquest gestor es de: " + this.maximAutoritzat + "€");
	}
}
