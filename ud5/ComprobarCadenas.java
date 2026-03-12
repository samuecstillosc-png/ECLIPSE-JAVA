package ud5;

import java.util.Scanner;

public class ComprobarCadenas {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce una cadena:");
        String cadena = entrada.nextLine();
        
        String[] palabras = cadena.split(" ");
        System.out.println("La cadena tiene " + palabras.length + " palabras");
        
        // Palabra más larga
        String palabramasLarga = ""; // Inicializado vacío para comparar
        for (String palabra : palabras) {
            if (palabra.length() > palabramasLarga.length()) {
                palabramasLarga = palabra;
            }
        }
        System.out.println("La palabra mas larga es " + palabramasLarga);
        
        // Contaremos cuantas palabras se repiten
        boolean[] revisado = new boolean[palabras.length];
        
        for (int i = 0; i < palabras.length; i++) {
            // Si ya ha sido revisada anteriormente, la saltamos
            if (revisado[i]) {
                continue;
            }
            
            int contador = 1;
            for (int j = i + 1; j < palabras.length; j++) {
                // Comparamos la palabra de la posición i con las siguientes
                if (palabras[i].equalsIgnoreCase(palabras[j])) {
                    contador++;
                    revisado[j] = true; // Marcamos como revisada para no volver a contarla
                }
            }
            
            // Si el contador es mayor que 1, es que se repite
            
            if (contador > 1) {
                System.out.println(palabras[i]+ ": "+ contador);
            }
        }
        

    }
}


			
	
		
		

	
	
	



