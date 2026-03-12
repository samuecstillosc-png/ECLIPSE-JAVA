package ud6;

import java.util.Scanner;

public class UsoAlumno {
	
	static Scanner entrada = new Scanner(System.in);
	static Grupo miGrupo = new Grupo();

	public static void main(String[] args) {
		

		
		int opcion;
		
		do {
			
			System.out.println("1. Dar Alta Alumno");
			System.out.println("2. Buscar Alumno");
			System.out.println("3. Modificar Nota");
			System.out.println("4. Realizar media de las notas");
			System.out.println("5. Realizar media de las notas menores a 5");
			System.out.println("6. Mostrar el alumno con las mejores notas");
			System.out.println("7. Mostrar el alumno que peores notas ha sacado");
			System.out.println("0. Para Salir");
			
			System.out.println("Seleccione una opción");
			opcion = entrada.nextInt();
			entrada.nextLine();
			
			
			switch (opcion) {
			case 1:
				darAlta();
				break;
				
			case 2:
				buscarAlumno();
				break;
			case 3:
				modificarNota();
				break;
				
			case 4:
				realizaMedia ();
				break;
				
			case 5:
				realizaMediaMenor();
				break;
				
			case 6:
				mejorNota();
				break;
			case 7:
				peorNota();
				
			default:
				System.out.println("Opción no válida");
				
				
			}
			
		}while (opcion !=0);
		
		

	
	}

	public static void darAlta () {
		
		System.out.println("Introduce el nombre del nuevo alumno: ");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Introduce la nota");
		
		double nota = entrada.nextDouble();
		
		Alumno nuevo = new Alumno (nombre, nota); {
			if(miGrupo.darAlta(nuevo)) {
				System.out.println("Alumno dado de alta");
			}else {
				System.out.println("Grupo lleno");
			}
			
		}
		
		
	}

	public static void buscarAlumno () {
		System.out.println("Introduce el nombre del alumno: ");
		
		String nombre = entrada.nextLine();
		
		Alumno a = miGrupo.buscarAlumno(nombre);
		
		if (a!=null) {
			System.out.println("Alumno encontrado: "+a.getNombre()+" Nota: "+a.getNota());
		} else {
			System.out.println("Alumno no encontrado");
		}
		
	}

	public static void modificarNota () {
		System.out.println("Introduce el nombre del alumno para modificar su nota");
		String nombre = entrada.nextLine();
		System.out.println("Introduce la nueva nota");
		double nota = entrada.nextDouble();
		
		if(miGrupo.modificarNota(nombre, nota)) {
			System.out.println("Nota modificada");
		}else {
			System.out.println("No se pudo encontrar al alumno");
		}
		
	}

	public static void realizaMedia () {
		System.out.println("La media es: "+miGrupo.realizaMedia());
		
		
	}

	public static void realizaMediaMenor() {
		System.out.println("La media de las notas menores a 5 es: "+miGrupo.realizaMediaMenor());
		
	}
	
	public static void mejorNota() {
		System.out.println("El alumno con la mejor nota es: "+miGrupo.mejorNota());
		
	}
	
	public static void peorNota () {
		System.out.println("El alumno con la peor nota es: "+miGrupo.peorNota());
		
	}
	

	
}
