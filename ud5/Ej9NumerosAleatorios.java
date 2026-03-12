package ud5;

import java.util.Random;

public class Ej9NumerosAleatorios {

    public static void main(String[] args) {
        Random genAle = new Random();

        int num = 0;
        int cont = 0;

        // Bucle que genera números mientras no salga el 24
        do {
            num = genAle.nextInt(51) * 2;
            System.out.println("Número aleatorio: " + num);
            cont++;
        } while (num != 24);

        System.out.println("Se han generado " + cont + " números.");
    }
}

