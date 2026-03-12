package ud3;

import java.util.Scanner;

public class Hoja0Ej1  {

	public static void main(String[] args) {
		
		//Mostrar "introduce un numero"
		 //1.- Desarrolle un algoritmo que permita leer dos valores distintos, determinar cuál de los
		//dos valores es el mayor y escribirlo por pantalla
		//ZDV num1, num2
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		//Mostrar "introduce un numero"
		System.out.println("Introduce el primer numero");
		num1 = sc.nextInt();
		//Leer num1
		System.out.println("Introduce el segundo numero");
		num2 = sc.nextInt();	
		//leer num2

				
		if (num1>num2) {
			System.out.println("El primer numero es mayor que el segundo");
			
		} else if (num1 == num2) {
			System.out.println("Los dos números son iguales");
		}  
		else {
			System.out.println("El segundo numero es mayor que el primero");
		}
	sc.close();
	}
}