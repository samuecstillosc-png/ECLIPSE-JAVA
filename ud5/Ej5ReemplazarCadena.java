package ud5;

import java.util.Scanner;

public class Ej5ReemplazarCadena {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce una cadena");
		String cad = entrada.nextLine();
		
		System.out.println("Que caracteres quieres cambiar");
		char viejo = entrada.nextLine().charAt(0);
		
		System.out.println("Por que caracter quieres sustituirlo?");
		
		char nuevo = entrada.nextLine().charAt(0);
		
		String cadNueva = cad.replace(viejo,nuevo);
		
		System.out.println("Cadena Original: "+cad);
		
		System.out.println("Cadena Nueva: "+cadNueva);

	}

}
