package ud5;

import java.util.Random;

//Hacer un programa que muestre un DNI aleatorio con 8 digitos y la letra
public class EjClaseAleatorioDNI {

	public static void main(String[] args) {
		//generamos dni
		
		Random genAle = new Random();
		
		int dni = genAle.nextInt(100000000);
		
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		int letra = dni % 23;
		
		char letraAsignada = letras.charAt(letra);
		
		System.out.println("DNI: "+dni+letraAsignada);
		
		}

	}
	

	
	


