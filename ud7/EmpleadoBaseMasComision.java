package ud7;

public class EmpleadoBaseMasComision extends Empleado {
    private int numVentas;
    private double comis;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, int salarioBase, int numVentas, int comis) {
        super(nombre, apellido, nss, salarioBase);
        this.numVentas = numVentas;
        this.comis = comis;
    }

    @Override
    public double calcularSalario() {
        // Sumamos el base de la clase padre + la comisión
        return getSalarioBase() + (numVentas * comis);
    }
}
