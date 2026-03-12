package ud3;

import java.util.Scanner;

//11. Que pida dos números y muestre todos los números que van desde el primero al
//segundo. Se debe controlar que los valores son correctos.

public class Hoja2Ej11 {

	public static void main(String[] args) {
		//habilitamos lectura
		Scanner entrada=new Scanner(System.in);
		
		//zdv
		int num1;
		int num2;
		
		System.out.println("INTRODUZCA NUMERO 1");
		//LEEMOS NUM1
		num1=entrada.nextInt();
		System.out.println("INTRODUZCA NUMERO 2");
		num2=entrada.nextInt();
		
		if (num1>num2) {
			System.out.println("El primer numero tiene que ser menor");
			
			
		} else {
			System.out.println("NUMEROS ENTRE " +num1+ " y " +num2+ ":");
			int i=num1;
		
		
		
		
		do {
			System.out.println(i);
			i++;
			
		} while (i<= num2);
			
		
		}
		

	}

}

	
	
