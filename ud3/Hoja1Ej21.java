package ud3;

import java.util.Scanner;

public class Hoja1Ej21 {

	//UD2-Programación
	//21. Que muestre un menú donde las opciones sean “Equilátero”, “Isósceles” y
	//“Escaleno”, pida una opción y calcule el perímetro del triángulo seleccionado.
	
	
	public static void main(String[] args) {

		
		//habilitamos lectura
		
		try (Scanner entrada = new Scanner(System.in)) {
			int perimetro=0;
			//pedimos por pantalla la opción que queramos 
			
			System.out.println("Para calcular el perimetro selecciona: 1 para equilatero, 2 para isósceles, 3 para escaleno");
			int opcion=entrada.nextInt();
			
			if ((opcion <= 0) || (opcion > 3)) {
				System.out.println("Opción no válida");
			}
			
			else if (opcion == 1) {
				System.out.println("Escribe un valor en centímetros");
				int lado=entrada.nextInt();
				perimetro=lado*3;
				System.out.println("El perímetro de tu triángulo es "+perimetro+ "cm.");
			}

			else if (opcion == 2) {
				System.out.println("Escribe cuanto miden los 2 lados iguales y luego del lado diferente en cm");
				int lado=entrada.nextInt();
				int lado1=entrada.nextInt();
				perimetro=(lado*2)+lado1;
				System.out.println("El perímetro de tu triángulo es "+perimetro+ "cm.");
			
			}
			
			else if (opcion == 3) {
				System.out.println("Escribe el valor de los 3 lados en centímetros");
				int lado=entrada.nextInt();
				int lado1=entrada.nextInt();
				int lado2=entrada.nextInt();
				perimetro=(lado+lado1+lado2);
				System.out.println("El perímetro de tu triángulo es "+perimetro+ "cm.");
			
}
		}
		
		

	
	}
}
