package ud7;

public class EmpleadoPorComision extends Empleado {
    private int numVentas;
    private double comis;

    public EmpleadoPorComision(String nombre, String apellido, String nss, int numVentas, double comis) {
        super(nombre, apellido, nss, 0); // Salario base 0
        this.numVentas = numVentas;
        this.comis = comis;
    }

    @Override
    public double calcularSalario() {
        return numVentas * comis;
    }
}
	


	