package ud5;

import java.util.Random;

public class Ej14GeneradorMelodías {

    public static void main(String[] args) {

        String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};
        Random genAle = new Random();

       
        int numNotas = (genAle.nextInt(7) + 1) * 4;

        String primeraNota = "";
        String notaActual = "";

        for (int i = 1; i <= numNotas; i++) {

            // d) La última nota debe coincidir con la primera
            if (i == numNotas) {
                notaActual = primeraNota;
            } else {
                notaActual = notas[genAle.nextInt(notas.length)];
            }

            // Guardamos la primera nota
            if (i == 1) {
                primeraNota = notaActual;
            }

            System.out.print(notaActual + " ");

            // Barra cada 4 notas
            
            if (i % 4 == 0) {
                if (i == numNotas) {
                    System.out.print("||");
                } else {
                    System.out.print("| ");
                }
            }
        }
    }
}

