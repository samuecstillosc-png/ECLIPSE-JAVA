package ud7;

public class Empleado extends Persona {
    private String nombre, apellido, nss;
    private double salarioBase;

    public Empleado(String nombre, String apellido, String nss, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nss = nss;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getNombre() { return nombre; }
    public double getSalarioBase() { return salarioBase; }

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return this.salario;
	}
}
	
	
	
	


