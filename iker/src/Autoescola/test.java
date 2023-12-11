package Autoescola;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumne alumne1 = new Alumne();
		Autoescola autoescola1 = new Autoescola();
		
		alumne1.setPractic(autoescola1.examenPractic());
		System.out.println(alumne1.getPractic());
	}

}
