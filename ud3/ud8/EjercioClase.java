package ud8;

import java.util.ArrayList;
import java.util.Scanner;

//Crear una lsta de String que almacene productos:
//MENU:
//1.AÑADIR PRODUCTO, 2. Mostrar todos los productos, 3. Borrar producto, 4.Sair

public class EjercioClase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<String>productos;
		
		productos = new ArrayList<String>();
		
		int opcion;
		
		do {
			System.out.println("1. Para añadir producto");
			System.out.println("2. Mostrar Productos");
			System.out.println("3. Borrar Producto");
			System.out.println("4. Salir");
			
			opcion = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcion) {
			
			case 1:
				System.out.println("Ingrese el nombre del producto: ");
				String producto = entrada.nextLine();
				System.out.println("Producto añadido correctamente!");
				productos.add(producto);
				break;
				
			case 2:
				for (int i =0;i<productos.size();i++) {
					System.out.println("Productos: "+productos.get(i));
				}
				break;
				
			case 3:
				System.out.println("Ingresa el nombre del producto para borrarlo");
				producto = entrada.nextLine();
				
				System.out.println("Producto Eliminado correctamente!");
				
				if (productos.contains(producto)) {
					productos.remove(productos.indexOf(producto));
					
				}else {
					System.out.println("El producto no se pudo eliminar");
				}	
				break;
				
			case 4:
				System.out.println("Has salido");
				
				}
			
			}while (opcion!=4);
			
		}
		
	}
	

			
			
		



