package ud6;

import java.util.Scanner;

public class PruebaPersona {

    public static void main(String[] args) {
        
        // Habilitamos entrada por teclado
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos
        System.out.print("Introduzca Nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        
        System.out.print("Introduce SEXO H/M: ");
        char sexo = entrada.next().toUpperCase().charAt(0);
        
        System.out.print("Peso: ");
        double peso = entrada.nextDouble();
        
        System.out.print("Altura: ");
        double altura = entrada.nextDouble();
        
        // objetos
        
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona();
        
        // Configurar p3 con setters
        
        p3.setNombre("Juan");
        p3.setEdad(25);
        p3.setSexo('H');
        p3.setPeso(80);
        p3.setAltura(1.83);
        
       
        
        Persona[] listaPersonas = {p1, p2, p3};
        
        for (int i = 0; i < listaPersonas.length; i++) {
            System.out.println("Resultados Persona: " + (i + 1));
            
            // Llamada al método estático de abajo
            
            mostrarMensajePeso(listaPersonas[i]);
            System.out.println("Es mayor de edad: " + listaPersonas[i].esMayordeEdad() != null? "SI" : "NO");
            System.out.println(listaPersonas[i].toString());
        }
    } 

   
    public static void mostrarMensajePeso(Persona p) {
        int resultado = p.calcularIMC();
        
        // Usamos las constantes definidas en la clase Persona
        
        switch (resultado) {
            case Persona.PESO_IDEAL:
                System.out.println("La persona está en su peso ideal.");
                break;
            case Persona.INFRAPESO:
                System.out.println("La persona está por debajo de su peso ideal.");
                break;
            case Persona.SOBREPESO:
                System.out.println("La persona tiene sobrepeso.");
                break;
            default:
                System.out.println("No se pudo calcular el peso.");
                break;
        }
    }
} 

