package ud3;

import java.util.Scanner;

//5. Que pida 3 números y los muestre en pantalla de menor a mayor

public class Hoja1Ej5 {

	public static void main(String[] args) {
		 //zdv
		int num1;
		int num2;
		int num3;
		
		try (//habilitamos lectura
		Scanner entrada = new Scanner(System.in)) {
			//pedimos por pantalla los 3 numeros 
			System.out.println("Introduzca numero 1");
			//Leemos num1
			num1=entrada.nextInt();
			System.out.println("Introduzca numero 2");
			//Leemos num2
			num2=entrada.nextInt();
			System.out.println("Introduzca numero 3");
			//Leemos num3
			num3=entrada.nextInt();
		}
		
		
		
		//5. Que pida 3 números y los muestre en pantalla de menor a mayor
		
		if (num1 < num2 & num2 < num3) {
			System.out.println("Los numeros son "+num1+ "," +num2+ "," +num3);
			
		}
		
		if (num3 < num2 & num2 < num1) {
			System.out.println("Los numeros son "+num3+ "," +num2+ "," +num1);
						
		}
		
		if (num1 < num3 & num3 < num2) {
			System.out.println("Los numeros son "+num1+ "," +num3+ "," +num2);
	
		}	
		if (num3 < num2 & num2 < num1) {
			System.out.println("Los numeros son "+num3+ "," +num2+ "," +num1);
			
		}
			
		if (num3 < num1 & num1 < num2) {
			System.out.println("Los numeros son "+num3+ "," +num1+ "," +num2);	
			
		}
		
		if (num2 < num1 & num1 < num3) {
			System.out.println("Los numeros son "+num2+ "," +num1+ "," +num3);
			
		}

	
	}		
	
	

}

