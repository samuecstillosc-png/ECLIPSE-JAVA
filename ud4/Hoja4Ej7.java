package ud4;
import java.util.Arrays;
import java.util.Scanner;

public class Hoja4Ej7 {
	
	//7. Que lea 10 números por teclado, los almacene en un array y los ordene de forma
	//ascendente.

	public static void main(String[] args) {
		try (
				//habilitamos entrada por teclado
		Scanner entrada = new Scanner(System.in)) {
			int [] numeros = new int [10];
			
			// enseñamos el primer array
			
			for (int i=0;i<10;i++) {
				System.out.println("Introduce numero "+(i+1)+ ":");
				numeros[i]=entrada.nextInt();
				
}
			System.out.println("Numeros en orden ascendente");
			Arrays.sort(numeros);
			
			//enseñamos el segundo con los numeros ascendentes
			
			
			for (int i=0;i<10;i++) {
				
				System.out.print(numeros[i]+ " ");

				
				
}
		}
		
		

	
}
	
}
