package ud7;

import java.util.Scanner;

public class UsoAgenda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Agenda agenda = new Agenda(10);
		
		int opcion = 0; // Inicializamos la variable
		
		do {
			System.out.println("1. Añadir contacto");
			System.out.println("2. Listar Agenda");
			System.out.println("3. Buscar un contacto");
			System.out.println("4. Eliminar contacto");
			System.out.println("5. Ver estado de la agenda (llena/vacía)");
			System.out.println("6. Ver huecos libres");
			System.out.println("7. Salir");
			System.out.print("Elige una opción: ");
			
			opcion = entrada.nextInt();
			entrada.nextLine(); 
			
			switch (opcion) {
			case 1:
				System.out.print("Nombre: ");
				String nombre = entrada.nextLine();
				System.out.print("Telefono: ");
				int telefono = entrada.nextInt();
				entrada.nextLine(); // Limpiamos buffer
				
				agenda.añadirContacto(new Contacto(nombre, telefono));
				break;
				
			case 2:
				agenda.listarAgenda();
				break;
				
			case 3:
				System.out.print("Nombre del contacto a buscar: ");
				String nombreBusqueda = entrada.nextLine();
				agenda.buscaContacto(nombreBusqueda);
				break;
				
			case 4:
				System.out.print("Nombre del contacto a eliminar: ");
				String nombreEliminar = entrada.nextLine();
				
				agenda.eliminaContacto(new Contacto(nombreEliminar, 0));
                break;
                
			case 5:
				if(agenda.agendaLlena()) {
					System.out.println("La agenda está completamente llena.");
				} else {
					System.out.println("La agenda aún tiene espacio.");
				}
				break;
				
			case 6:
				System.out.println("Huecos disponibles: " + agenda.huecosLibres());
				break;
				
			case 7:
				System.out.println("Saliendo del programa...");
				break;
				
			default:
				System.out.println("Opción no válida.");
			}
			
		} while (opcion != 7); 
		

	}
}

