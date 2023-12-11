package tema5;

public class test {

	public static void main(String[] args) {

		Persona p = new Persona("lluis", 22, 1.45);
		Persona q = new Persona();
				
		System.out.println("Nombre: " + p.nombre);
		System.out.println("Altura: " + p.altura);
		System.out.println("Edad: " + p.edad);
		
		System.out.println("Nombre: " + q.nombre);
		System.out.println("Altura: " + q.altura);
		System.out.println("Edad: " + q.edad);
		
		p.saludar();
		p.caminar();
		p.cumpleAnyos(); // es suma 1 a edad
		
		
	}

}
