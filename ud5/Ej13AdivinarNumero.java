package ud5;

import java.util.Random;
import java.util.Scanner;

public class Ej13AdivinarNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int min = 0;
        int max = 100;
        Random genAle = new Random();

        int numAle = genAle.nextInt(max - min + 1) + min;
        String opcion;

        do {
            System.out.println("El número es: " + numAle);
            System.out.println("Indica si el número real es mayor, menor o igual:");
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


