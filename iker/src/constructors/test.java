package constructors;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Primer constructor
		Animales a = new Animales("mono",4,true);
		//Segundo constructor
		Animales b = new Animales("Felino", 4);
		//Tercer constructor
		Animales h = new Animales(true);
		
		a.muestraInfo();
		System.out.println("--------------");
		b.muestraInfo();
		System.out.println("--------------");
		h.muestraInfo();
		}

}
