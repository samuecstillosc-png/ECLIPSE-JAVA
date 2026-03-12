package ud3;
// Que pida (siempre por teclado) un número del 1 al 5 y diga (que muestre por
// pantalla) si es primo o no.

import java.util.Scanner;

public class Numero1Al5PrimoOno {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un numero del 1 al 5");
		
		//Leemos un entero
		num=entrada.nextInt();
		
		//comprobamos si esta entre 1 y 5
		
		if (num<1 || num>5) {
			System.out.println("Numero fuera de rango");
		}
		
		else if (num==4) {
			System.out.println("El numero NO es primo");
		
		} else {
			System.out.println("El numero ES primo");
		}
		
		
		
		}

	}


