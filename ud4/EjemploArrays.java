package ud4;

import java.util.Scanner;

public class EjemploArrays {

	public static void main(String[] args) {
		//habilitamos entrada
		Scanner entrada=new Scanner(System.in);
		//definimos un array:
		int [] notas;
		//reservamos RAM
		notas=new int[8];
		//definicion de variables
		int suma=0;
		double media;
		int i=0;
		
		for (i=0;i<8;i++) {
			System.out.println("Introduce nota "+(i+1)+":");
			notas[i]=entrada.nextInt();
			suma=suma+notas[i];
			
		}
		System.out.println("La media es "+(suma/8.0));
		//mostramos notas
		
		for(i=0;i<8;i++) {
			System.out.println("NOTA:"+notas[i]);
		}
		

	}

}
