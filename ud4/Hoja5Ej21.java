package ud4;

import java.util.Scanner;

public class Hoja5Ej21 {

    // 21. Elevar un número a una potencia usando recursividad

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int n = entrada.nextInt();

        System.out.println("Indica a qué potencia quieres elevar el número: ");
        int potencia = entrada.nextInt();

        int resultado = potencia(n, potencia);

        System.out.println("La potencia de " + n + " es " + resultado);

        entrada.close();
    }

    
    public static int potencia(int a, int b) {
        if (b == 0) {        
            return 1;
        } else {
            return a * potencia(a, b - 1);
        }
    }
}

