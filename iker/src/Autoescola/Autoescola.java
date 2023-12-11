package Autoescola;

public class Autoescola {

	boolean examenTeoric() {
		int aprobaTeoric = (int) Math.random()*2+1;
		if(aprobaTeoric == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean examenPractic() {
		int aprobaPractic = (int) (Math.random()*2+1);
		if(aprobaPractic == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	boolean donarCarnet(Alumne alumne) {
		if(alumne.getPractic() && alumne.getTeoric()) {
			return true;
		}else {
			return false;
		}
	}
}
