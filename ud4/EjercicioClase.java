package ud4;

import java.util.Scanner;

public class EjercicioClase {
	
	//un programa en el que nos pida cuantas letras tiene una palabra, se lo digamos y que nos pida después que
	//pongamos la palabra letra a letra.

	public static void main(String[] args) {
		// habilitamos entrada
		
		Scanner entrada=new Scanner(System.in);
		
		//zdv
		
	    char [] palabra;
	    int numeroDeLetras=0;
	    
	    
	    System.out.println("Cuantas letras tiene tu palabra");
	    numeroDeLetras=entrada.nextInt();
	    //vaciamos el buffer
	    
	    entrada.nextLine();
	    
	    //construimos el array
	    palabra = new char [numeroDeLetras];
	    
	    
	    System.out.println("Introduce letra a letra la palabra");
	    
	    for (int i=0;i<numeroDeLetras;i++) {
	    	palabra[i] = entrada.nextLine().charAt(0);
	    }
	    
	    //mostramos la palabra
	    
	    for (int i=0; i<numeroDeLetras;i++) {
	    	System.out.print(palabra[i]);
	    	
	    }
	    
	    System.out.println();
	    
	    //mostramos la palabra al reves
	    
	    for (int i=numeroDeLetras-1;i>=0;i--) {
	    	System.out.print(palabra[i]);
	    	
	    }
	}
	
		

}
