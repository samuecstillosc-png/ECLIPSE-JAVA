package ud3;

import java.util.Scanner;

public class Hoja3Ej1Piramides {

	public static void main(String[] args) {
		
		//zdv
		int i,j,k,filas;
		
		//habilitamos lectura
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de filas de la pirámide");
		
		//leemos filas
		
		filas = sc.nextInt();
		
		//ponemos lo que hacemos en cada fila
		
		for (i=1;i<=filas;i++) {
			
			for (j=i; i < filas; j++) {
				System.out.print(" ");
			}
			
		}
		
		//asteriscos de la fila
		
		for (k = 1; k <= (2*i-1); k++) {
			System.out.println("*");
		}
		
		//salto de linea 
		System.out.println();
		
	}

}
