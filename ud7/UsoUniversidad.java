package ud7;

import java.util.Scanner;



public class UsoUniversidad {
	static Scanner entrada = new Scanner(System.in);
	static Persona[] persona = new Persona[6];
	private static int contador=0;

	public static void main(String[] args) {

		
		int opcion;
		

		
		do {
			
			System.out.println("1. Dar de Alta Estudiante");
			System.out.println("2. Dar de Alta Profesor");
			System.out.println("3. Dar de Alta Personal de Servicio");
			System.out.println("4. Mostrar estadísticas");
			System.out.println("5. Salir");
			
			opcion = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcion) {
			case 1:
				darAltaEstu();
				break;
				
			case 2:
				darAltaProfe();
				break;
				
			case 3:
				darAltaPs();
				break;
				
			case 4:
				mostrarEstadisticas();
				break;
				
			default:
				System.out.println("Opción no valida");
			}
			
			
		}while (opcion!=5);
		
		
	}

	private static void darAltaEstu() {
		
		
		System.out.println("Introduce el nombre del Alumno:");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Apellidos:");
		
		String apellidos = entrada.nextLine();
		
		System.out.println("Estado civil:");
		
		String estadoCivil = entrada.nextLine();
		
		System.out.println("DNI:");
		
		String dNI = entrada.nextLine();
		
		System.out.println("Curso: ");
		
		String curso = entrada.nextLine();
		
		Estudiante nuevo = new Estudiante (nombre, apellidos, estadoCivil, dNI, curso); {
			

			if (contador < persona.length) {
		        persona[contador] = nuevo;
		        contador++;
		        System.out.println("Estudiante registrado con éxito.");
		    } else {
		        System.out.println("Error: No se pueden registrar más estudiantes");
		    }
		}
		}
		
	private static void darAltaProfe () {
		
		
		System.out.println("Introduce el nombre del Profesor:");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Apellidos:");
		
		String apellidos = entrada.nextLine();
		
		System.out.println("Estado civil:");
		
		String estadoCivil = entrada.nextLine();
		
		System.out.println("DNI:");
		
		String dNI = entrada.nextLine();
		
		System.out.println("Año Incorporacion: ");
		
		int anoIncorporacion = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Despacho: ");
		
		String despacho = entrada.nextLine();
		
		
		System.out.println("Departamento: ");
		
		String departamento = entrada.nextLine();
		
		
		
		Profesor nuevo = new Profesor (nombre, apellidos, estadoCivil, dNI, anoIncorporacion, despacho, departamento);{
			
			if (contador<persona.length) {
				persona[contador]=nuevo;
				contador++;
				
				System.out.println("Profesor registrado con exito!");
				
			}else {
				System.out.println("No se puede registrar");
			}
		}
			
		}
		
		private static void darAltaPs () {
			
			System.out.println("Introduce el nombre del Personal de Servicio:");
			
			String nombre = entrada.nextLine();
			
			System.out.println("Apellidos:");
			
			String apellidos = entrada.nextLine();
			
			System.out.println("Estado civil:");
			
			String estadoCivil = entrada.nextLine();
			
			System.out.println("DNI:");
			
			String dNI = entrada.nextLine();
			
			System.out.println("Año Incorporacion: ");
			
			int anoIncorporacion = Integer.parseInt(entrada.nextLine());
			
			System.out.println("Despacho: ");
			
			String despacho = entrada.nextLine();
			
			
			System.out.println("Seccion: ");
			
			String seccion = entrada.nextLine();
			
			
			PersonalDeServicio nuevo = new PersonalDeServicio (nombre, apellidos, estadoCivil, dNI, anoIncorporacion, despacho, seccion);{
				
				if (contador<persona.length) {
					persona[contador]=nuevo;
					contador++;
					System.out.println("Personal registrado correctamente! ");
					
				}else {
					System.out.println("No hay espacio para registrarlo");
				}
			}
			}
			
			
		private static void mostrarEstadisticas () {
			
			System.out.println("ESTADÍSTICAS DE PERSONAS");
		    
		    for (int i = 0; i < contador; i++) {
	
		    	
		        if (persona[i] instanceof Estudiante) {
		            System.out.print("ALUMNO: ");
		        } 
		        else if (persona[i] instanceof Profesor) {
		            System.out.print("PROFESOR: ");
		        } 
		        else if (persona[i] instanceof PersonalDeServicio) { 
		            System.out.print("P. SERVICIO: ");
		        }
		        
		    
		        System.out.println(persona[i].toString());
		    }
		}

		
	{
		
	}

	
	
	
		
		
		

		
		
	}


