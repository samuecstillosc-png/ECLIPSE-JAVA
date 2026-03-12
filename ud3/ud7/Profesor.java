package ud7;

public class Profesor extends EmpleadoUniversidad {
	private String departamento;

	public Profesor(String nombre, String apellidos, String estadoCivil, String dNI, int anoIncorporacion,String despacho, String departamento) {
		super(nombre, apellidos, estadoCivil, dNI, anoIncorporacion, despacho);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + "]";
	}


	}


	
	
	

