package ud6;

import java.util.Scanner;

public class UsoFraccion {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int den1;
		int num1;

		System.out.println("Introduce numerador de la primera fraccion");
		num1 = entrada.nextInt();
		
		System.out.println("Introduce denominador de la primera fraccion");
		
		den1 = entrada.nextInt();
		
		Fraccion f1 = new Fraccion(num1, den1);
		
		int den2;
		int num2;
		
		System.out.println("Introduce numerador y denominador de la segunda fracción");
		
		Fraccion f2 = new Fraccion(entrada.nextInt(), entrada.nextInt());
		
		
		System.out.println(f1+" x "+f2+"="+f1.multiplica(f2));
		System.out.println(f1+" / "+f2+"="+f1.divide(f2));
		
		
		
		

	}
	
	
	
	
		
		
		
		
	

}


