package Segundo;
import Primero.*; // al importar a ya podemos usarlo aqui (A si tiene que ser publico)
public class C {

	A a = new A(); // no se ven sin el import
	B b = new B(a.numero, "iker"); // la vecina si se ven

	void pintaB() {
		b.info();
	}
	
	void llamoaA() {
		a.prueba();;
	}
}
