package ud3;

import java.util.Scanner;

public class EjemploMultiplicaPorDos {

	public static void main(String[] args) {
		try (//Habilitamos la lectura de datos por consola
		Scanner entrada = new Scanner(System.in)) {
			System.out.println("INTRODUCE UN NUMERO");
			//Leemos un entero
			int num=entrada.nextInt();
			
			int doble=num*2;
			System.out.println("El doble de "+num+" es "+doble);
		}

	}

}
