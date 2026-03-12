package ud3;

import java.util.Scanner;

//20. Que haga un menú del tipo “desea salir (S/N)” y el programa no termine hasta que el
//usuario teclee “S”.

public class Hoja2Ej20 {

	public static void main(String[] args) {
		//habilitamos lectura por teclado
		Scanner entrada=new Scanner(System.in);
		
		char opcion='a';
		do {
			System.out.println("Desea salir s/n?");
			//leemos caracter
			opcion=entrada.nextLine().charAt(0);
		}while (opcion!='s');
		System.out.println("Has salido");
			
		}

	}


