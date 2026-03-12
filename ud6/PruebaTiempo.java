package ud6;

import java.util.Scanner;

public class PruebaTiempo {

	public static void main(String[] args) {
		
		Tiempo t1 = new Tiempo (20,45);
		
		System.out.println(t1);
		
		t1.cambiaHora(25);
		
		System.out.println(t1.toString());
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tiempo y hora");
		
		int hora = entrada.nextInt();
		
		int minuto = entrada.nextInt();
		Tiempo tiempo2 = new Tiempo(hora,minuto);
		System.out.println(tiempo2.toString());

	}

}
