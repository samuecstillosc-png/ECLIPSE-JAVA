package ud7;

public abstract class Persona {
	
	private String nombre,apellidos,estadoCivil,DNI;
	protected double salario;
	
	

	public Persona(String nombre, String apellidos, String estadoCivil, String dNI, double salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estadoCivil = estadoCivil;
		DNI = dNI;
		this.salario=salario;
	}
	
	public abstract double calculaSalario();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", estadoCivil=" + estadoCivil + ", DNI="
				+ DNI + "]";
	}
	
	
	
}
