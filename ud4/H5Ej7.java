package ud4;

import java.util.Scanner;

public class H5Ej7 {

	public static void main(String[] args) {
		
		//habilitamos entrada por teclado 
		
		Scanner entrada=new Scanner(System.in);
		// definimos los arrays
		int opcion=0;
		//mostramos el menu
		
		do {
			System.out.println("1. Para sumar");
			System.out.println("2. Para restar");
			System.out.println("3. Para multiplicar");
			System.out.println("4. Para dividir");
			opcion=entrada.nextInt();
			
			switch (opcion) {
			
			case 1: 
				System.out.println("Introduce Primer número");
				int a=entrada.nextInt();
				System.out.println("Introduce Segundo número ");
				int b=entrada.nextInt();
				System.out.println();
				System.out.println("La suma es: "+sumar(a,b));
				break;
				
			case 2:
				System.out.println("Introduce Primer número");
				a=entrada.nextInt();
				System.out.println("Introduce Segundo número ");
				b=entrada.nextInt();
				System.out.println("La resta es "+restar(a,b));
				break;
				
			case 3: 
				System.out.println("Introduce Primer número");
				a=entrada.nextInt();
				System.out.println("Introduce Segundo número ");
				b=entrada.nextInt();
				System.out.println("La multiplicacion es "+multiplicar(a,b));
				break;
				
			case 4:
				System.out.println("Introduce Primer número");
				a=entrada.nextInt();
				System.out.println("Introduce Segundo número ");
				b=entrada.nextInt();
				System.out.println("La división es "+dividir(a,b));
				break;
				
			default:
				System.out.println("Opción no válida");
				
				
				
				
			}
		} while (opcion !=5);
		
			
		}

	
	public static int sumar (int a, int b) {
		int r = a+b;
		return r;
	}
	
	public static int restar (int a, int b) {
		int r = a-b;
		return r;
		
	}
	
	public static int multiplicar (int a, int b) {
		int r = a*b;
		return r;
		
		
	}
	
	public static int dividir (int a, int b) {
		int r = a/b;
		return r;
	
	}

}
