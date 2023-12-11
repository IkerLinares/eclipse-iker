package Hores;

public class hores {
	
	//declaram las variables privadas per emprar amb els getters i setters
	private int hora;
	private int minut;
	private int segon;
	private int temps;
	
	//Cream un metode que dona la hora actual
	void infohora(){
		System.out.println("Son las  " + hora + ":" + minut + ":" + segon);
	}
	
	//metode que fa que si els segons pasan de 59 es sumi un a minuts i igual amb les horas
	void sumarTemps(){
		for(int i = 1; i <= temps; i++) {
			setSegon(getSegon() + 1);
			if(getSegon() >= 60) {
				setMinut(getMinut() + 1);
				setSegon(0);
			}
			if(getMinut() >= 60) {
				setHora(getHora() + 1);
				setMinut(0);
			}
		}
	}

	//getter de hora
	public int getHora() {
		return hora;
	}

	//setter de hora
	public void setHora(int hora) {
		this.hora = hora;
	}

	//getter de minut
	public int getMinut() {
		return minut;
	}

	//seter de minut
	public void setMinut(int minut) {
		this.minut = minut;
	}

	//getter de segon
	public int getSegon() {
		return segon;
	}

	//setter de segon
	public void setSegon(int segon) {
		this.segon = segon;
	}

	//getter de temps
	public int getTemps() {
		return temps;
	}

	//setter de temps
	public void setTemps(int temps) {
		this.temps = temps;
	}
	
}
