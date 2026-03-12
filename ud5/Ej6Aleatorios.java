package ud5;

import java.util.Random;
import java.util.Scanner;

public class Ej6Aleatorios {
	
	//6. Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y
	//tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
	//oportunidades quedan y si el número introducido es menor o mayor que el número secreto

	public static void main(String[] args) {
		

        int min = 0;
        int max = 100;
        Random genAle = new Random();

        int numAle = genAle.nextInt(max - min + 1) + min;
        String opcion;

        do {
            System.out.println("El número es: " + numAle);
            System.out.println("Indica si el número real es mayor, menor o igual:");
            Scanner entrada = new Scanner (System.in);
			opcion = entrada.nextLine();

            if (opcion.equalsIgnoreCase("mayor")) {
                min = numAle;

            } 
            
            if (opcion.equalsIgnoreCase("menor")) {
                max = numAle;
            }
            

     
            if (!opcion.equalsIgnoreCase("igual")) {
                numAle = genAle.nextInt(max - min + 1) + min;
            }

        } while (!opcion.equalsIgnoreCase("igual"));

        System.out.println("¡Adivinado!");
    }
}



