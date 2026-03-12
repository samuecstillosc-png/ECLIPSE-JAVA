package ud7;

public class PersonalDeServicio extends EmpleadoUniversidad {
	
	private String seccion;

	public PersonalDeServicio(String nombre, String apellidos, String estadoCivil, String dNI, int anoIncorporacion, String despacho, String seccion) {
		super(nombre, apellidos, estadoCivil, dNI, anoIncorporacion, despacho);
		this.seccion = seccion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return super.toString()+"Seccion: "+seccion;
	}
	
	
}
