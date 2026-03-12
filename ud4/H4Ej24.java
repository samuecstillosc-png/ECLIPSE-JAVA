package ud4;

import java.util.Scanner;

public class H4Ej24 {
    final static int TAM = 10;
    static char[] nombre = new char[TAM];
    static double[] precio = new double[TAM];
    static int[] stock = new int[TAM];
    static int pos = 0;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("1. DAR DE ALTA ");
            System.out.println("2. BUSCAR PRODUCTO");
            System.out.println("3. MODIFICAR PRODUCTO");
            System.out.println("4. SALIR");
            opcion = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcion) {
            case 1:
                darAlta();
                break;
            case 2:
                buscarYmostrarProducto();
                break;
            case 3:
                modificarProducto();
                break;
            case 4:
                System.out.println("Has salido");
                break;
            default:
                System.out.println("Opción no válida");
            }

        } while (opcion != 4);
    }

    public static void darAlta() {
        if (pos < TAM) {  
            System.out.println("Introduce nombre (primer carácter)");
            nombre[pos] = entrada.nextLine().charAt(0);

            System.out.println("Introduce precio");
            precio[pos] = entrada.nextDouble();

            System.out.println("Introduce stock");
            stock[pos] = entrada.nextInt();
            entrada.nextLine(); 

            pos++;
        } else {
            System.out.println("Almacén lleno");
        }
    }

    public static void buscarYmostrarProducto() {

        System.out.println("Introduce nombre del producto");
        char buscado = entrada.nextLine().charAt(0);

        for (int i = 0; i < pos; i++) {  
            if (buscado == nombre[i]) {
                System.out.println("Nombre: " + nombre[i]);
                System.out.println("Precio: " + precio[i]);
                System.out.println("Stock: " + stock[i]);
                return;
            }
        }

        System.out.println("Producto no encontrado");
    }
    
    public static void modificarProducto() {

        System.out.println("Introduce nombre del producto");
        char buscado = entrada.nextLine().charAt(0);

        for (int i = 0; i < pos; i++) {  
            if (buscado == nombre[i]) {
                
                System.out.println("Introduce nuevo precio");
                precio[i] = entrada.nextDouble();

                System.out.println("Introduce nuevo stock");
                stock[i] = entrada.nextInt();

                entrada.nextLine();

                System.out.println("Producto modificado correctamente");
                return;
            }
        }

        System.out.println("Producto no encontrado");
    }
}

     

