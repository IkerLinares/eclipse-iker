package Segundo;

class B {
	//b y c son clases vecinas, si estan en package distintos son clases externas
	
	String alumno;
	private double notamedia;
	String password;
	
	B(String alumno){
		this.alumno = alumno;
		this.notamedia = 0;
	}
	
	void asignanotamedia(double notamedia, String password){
		if(!password.equals("1234")) return;
		
		
		//nos aseguramos que esta en el rango adecuado(0 -10)
		if(notamedia>=0 && notamedia<=10) {
			this.notamedia = notamedia;
		}else {
			System.out.println("Valor no permitido");
		}
	}
	
	void muestraifo() {
		System.out.println("alumno: " + this.alumno);
		System.out.println("nota media: " + this.notamedia);
	}
}
