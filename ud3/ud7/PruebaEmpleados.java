package ud7;

import java.util.Scanner;

public class PruebaEmpleados {
    static Scanner scanner;
    
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[4]; // 2 de cada tipo
        scanner = new Scanner(System.in);
        
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("¿Qué tipo de empleado quieres dar de alta? "
                    + "1.BaseMasComision 2.PorComision");
            String opcion = scanner.nextLine();
            
            if (opcion.equals("1") || opcion.equals("2")) {
                
                empleados[i] = new PruebaEmpleados().pedirDatosEmpleado(opcion);
            } else {
                System.out.println("Opcion incorrecta");
                i--;
            }
        }
        
        // Imprimir resultados
        System.out.println("LISTADO");
        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() + " - Salario: " + e.getSalarioBase());
        }
    }

    public Empleado pedirDatosEmpleado(String opcion) {
        System.out.println("Introduce nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce apellido");
        String apellido = scanner.nextLine();
        System.out.println("Introduce nss");
        String nss = scanner.nextLine();
        
        String salarioB = "0";
        if (opcion.equals("1")) {
            System.out.println("Introduce salario base");
            salarioB = scanner.nextLine();
        }
        
        System.out.println("Introduce número de ventas");
        String numV = scanner.nextLine();
        System.out.println("Introduce comisión por venta");
        String com = scanner.nextLine();
        
        Empleado empleado = null;
        if (opcion.equals("1")) {
            empleado = new EmpleadoBaseMasComision(nombre, apellido, nss, 
                    Integer.parseInt(salarioB), Integer.parseInt(numV), Integer.parseInt(com));
        }

        if (opcion.equals("2")) {
            empleado = new EmpleadoPorComision(nombre, apellido, nss, 
                    Integer.parseInt(numV), Integer.parseInt(com));
        }
        return empleado;
    }
}
	


