package ud4;

import java.util.Scanner;

public class Hoja4Ej6 {

//6. Que lea 10 números por teclado, los almacene en un array y muestre la suma,
//resta, multiplicación y división de todos.

	public static void main(String[] args) {
		// Habilitamos entrada por teclado

		Scanner entrada = new Scanner(System.in);

		// definimos los arrays

		// definimos arrays

		int[] numeros = new int[10];
		int suma = 0;
		int resta = 0;
		int multiplicacion = 1;
		double division = 1;
		// mostramos el array

		for (int i = 0; i < 3; i++) {
			do {
				System.out.println("Introduce un valor distinto de 0: ");
				numeros[i] = entrada.nextInt();
			} while (numeros[i] == 0);

		}
		// iniciamos las variables
		division = numeros[0];
		suma = numeros[0];
		resta = numeros[0];
		multiplicacion = numeros[0];
		for (int i = 1; i < 3; i++) {
			suma = suma + numeros[i];
			resta = resta - numeros[i];
			multiplicacion = multiplicacion * numeros[i];
			division = division / numeros[i];

		}
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division);
	}

}
