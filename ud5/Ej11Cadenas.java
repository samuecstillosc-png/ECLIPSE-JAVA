package ud5;

import java.util.Scanner;

public class Ej11Cadenas {
	
	//Ejercicio 11. Realizar una función a la que se le pasa por parámetro una cadena
	//con un email, y dicha función devuelve si el mail está bien formado.
	
	
	//1.1.- Contiene una y solo una arroba.
	//1.2.- No puede contener dos puntos seguidos '.' después de la arroba.
	//1.3.- No puede contener ' '

	public static void main(String[] args) {
		
		// habilitamos entrada
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introduce un email");
		
		String email = scanner.nextLine();
		
		if (contieneUnaArroba(email)) {
			System.out.println("El email es correcto ");
		
		}else {
			System.out.println("Email incorrecto debe contener una sola @");
		}
		
		if (contieneEspacio(email)) {
			System.out.println("El email está bien escrito ");
			
		}else {
			System.out.println("El email es incorrecto no puede tener espacios");
		}
		
			   
			   
			   
		   }
	
	
		public static  boolean emailCorrecto (String email) {
			
			if (!contieneUnaArroba(email))
				return false;
			
			if (contieneEspacio(email)) 
				return false;
			return false;
			
			//solo tiene una arroba y no contiene espacio 
			
			
			
		}
		   
	   
	   
		public static boolean contieneUnaArroba (String email) {
			
			if (email.lastIndexOf("@")==-1) //no hay arroba
				return false;				
				
			if (email.lastIndexOf("@")==email.indexOf("@"))
				return true; //solo hay una
			
		
			
			//hay mas de una arroba
			
			return false;
			}
		
		public static boolean contieneEspacio(String email) {
			if (email.indexOf(" ")==-1)
				return false; 
			
			return true;
		}
			
		}
	
		
	

