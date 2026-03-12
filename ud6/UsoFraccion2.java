package ud6;

import java.util.Scanner;

public class UsoFraccion2 {
	static Scanner entrada;
	static Fraccion [] fracciones;
	static final int TAM=3;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		fracciones=new Fraccion [TAM];
		rellena();
		System.out.print(dameOperandos('x'));
		System.out.println(multiplicaFracciones());
		System.out.print(dameOperandos('/'));
		System.out.println(divideFracciones());
		}
	
	
	public static void rellena() {
		for (int i=0;i<TAM;i++) {
			System.out.println("Introduce numerador y denominador "+i+":");
			fracciones [i]=new Fraccion(entrada.nextInt(),entrada.nextInt());
		}
	}
	
	public static String dameOperandos(char op) {
	    String cad = "";
	    for (int i = 0; i < TAM; i++) {
	        cad += fracciones[i];
	        if (i < TAM - 1) {
	            cad += " " + op + " "; 
	        }
	    }
	    cad += " = "; 
	    return cad;
	}
	
	
	public static Fraccion multiplicaFracciones() {
		Fraccion rsdo = fracciones[0];
		for (int i=0;i<TAM;i++) {
			rsdo = rsdo.multiplica(fracciones[i]);
		}
		
		return rsdo;
	}
	
	public static Fraccion divideFracciones() {
		Fraccion rsdo = fracciones[0];
		for (int i =1;i<TAM;i++) {
			rsdo = rsdo.divide(fracciones[i]);
			
		}
		
		return rsdo;
		
	}


		
		
		
		
	}

	


