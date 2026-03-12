package ud4;

import java.util.Scanner;


public class Ej1Vocales {
	
	

	public static void main(String[] args) {
		
		
		char letra = 'A';
		
		if (esVocal2(letra)==true) {
			System.out.println("Es vocal");
			
		} else {
			System.out.println("Es consonante");
		}
		
		
	}
		
	
	
	//funciones para comprobar si es vocal o no. 
	
	public static boolean esVocal (char letra) {
		
		if ((letra=='a')||(letra=='e')||(letra=='i')||(letra=='o')||(letra=='u')) {
			return true;
			
		}
		
		return false;
		
	}
	
	public static boolean esVocal2 (char letra) {
		char [] vocales = {'a','e','i','o','u','A','E','I','O','U'};
		for (int i=0;i<10;i++) {
			if (vocales[i]==letra) {
				return true;
			}
		}
		
		return false;
	}

}
	

