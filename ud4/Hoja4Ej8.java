package ud4;
import java.util.Scanner;

public class Hoja4Ej8 {
	
	//8. Que lea 10 números por teclado, 5 para un array y 5 para otro array distinto.
	//Mostrar los 10 números en pantalla mediante un solo array.

	public static void main(String[] args) {
		//habilitamos entrada por teclado 
		Scanner entrada=new Scanner(System.in);
		
		//definimos arrays

		int [] numeros1 = new int [5];
		int [] numeros2 = new int [5];
		int [] numeros3 = new int [10];
		
		
		//primer array
		
		for (int i=0;i<5;i++) {
			System.out.println("Introduce numero "+(i+1)+ ":");
			numeros1[i]=entrada.nextInt();
				
		}
		
		//segundo array
		
		for (int i=0;i<5;i++) {
			System.out.println("Introduce numero "+(i+1)+ ":");
			numeros2[i]=entrada.nextInt();
		}
		
		//mostramos los dos arrays
		
		for (int i=0;i<10;i++) {
			if (i<5) {
				numeros3[i]=numeros1[i];
				
			} else  {
				numeros3[i]=numeros2[i-5];
			}
			
			System.out.print(numeros3[i]+ " ");
		
		}
		
	}
		
}
