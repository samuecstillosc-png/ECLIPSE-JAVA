package ud5;

import java.util.Scanner;

//pide una cadena de dos caracteres por teclado, valida que sea un caracter
//sustituye la aparicion del primer caracter en la cadena por el segundo caracter.



public class Ej7Cadenas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cad = scanner.nextLine();
		
		
		
		String entrada1;
		
		do {
			System.out.println("Introduce el caracter a sustituir: ");
			entrada1=scanner.nextLine();
		}while (entrada1.length()!=1);
		char primero = entrada1.charAt(0);
		
		String entrada2;
		do {
			System.out.println("Introduce el nuevo caracter: ");
			entrada2=scanner.nextLine();
		}while (entrada2.length()!=1);
		char segundo = entrada2.charAt(0);
		
		String resultado = cad.replaceFirst(String.valueOf(primero), String.valueOf(segundo));
		
		System.out.println("Resultado: "+resultado);
	}
	
	}



		
