package ud4;
import java.util.Scanner;

public class Hoja4Ej14 {
	
	//que rellene un array con 20 numeros y luego un numero en concreto

	public static void main(String[] args) {
		
		//definimos el array
		final int TAM=5;
		int [] numeros=new int [TAM];
		//habilitamos lectura
		Scanner entrada=new Scanner(System.in);
		
		//mostramos el array
		
		for (int i=0;i<TAM;i++) {
			System.out.println("Introduce el numero:");
			numeros[i]=entrada.nextInt();
			
		}
		
		System.out.println("Introduce número a buscar");
		int numeroABuscar=entrada.nextInt();
		int i=0;
		boolean numEncontrado = false; 
		while (i<TAM&&!numEncontrado) {
			if (numeros[i] == numeroABuscar) {
				numEncontrado=true;
			}else {
				i++;
			}
			
			
		}while ((numEncontrado==false)&&(i<TAM));
		if (numEncontrado==true) {
			System.out.println("Valor encontrado en la posicion "+i);
		}else {
			System.out.println("Valor no encontrado");
		}
	}

}
