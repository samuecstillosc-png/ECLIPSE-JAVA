package ud5;

public class Ej6DesplazarCadena {

	public static void main(String[] args) {
		String cad = "Hola a todos";
		
		int desplazar = 2;
		
		String cadDesplazada= cad.substring(cad.length()-desplazar, cad.length());
		
		cadDesplazada+=cad.substring(0, cad.length()-desplazar);
		System.out.println(cadDesplazada);

	}

}
