package ud4;

import java.util.Scanner;

public class EjemploDeBidimensionales {

	public static void main(String[] args) {
		// como definimos el array
		
		int [][] matriz = new int [2][3];
		Scanner entrada = new Scanner(System.in); 
			for (int i=0;i<2;i++) {
				for (int j=0;j<3;j++) {
					System.out.println("Introduce un numero: ");
					matriz[i][j]=entrada.nextInt();
				}
			}
			
			
			for (int i=0;i<2;i++) {
				for (int j=0;j<3;j++) {
					System.out.print(matriz[i][j]+ " ");
		}
				
				System.out.println();
				
			}
			
		}
		

		

	}

