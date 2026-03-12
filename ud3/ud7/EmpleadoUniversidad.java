package ud7;

public class EmpleadoUniversidad extends Persona{
	
	private int anoIncorporacion;
	private String despacho;

	public EmpleadoUniversidad(String nombre, String apellidos, String estadoCivil, String dNI, int anoIncorporacion, String despacho) {
		super(nombre, apellidos, estadoCivil, dNI);
		this.anoIncorporacion = anoIncorporacion;
		this.despacho = despacho;
	}

	public int getAnoIncorporacion() {
		return anoIncorporacion;
	}

	public void setAnoIncorporacion(int anoIncorporacion) {
		this.anoIncorporacion = anoIncorporacion;
	}

	public String getdespacho() {
		return despacho;
	}

	public void setdespacho(String despacho) {
		this.despacho = despacho;
	}

	@Override
	public String toString() {
		return super.toString()+"Año de incorporacion:"+anoIncorporacion+"Numero de despacho:"+despacho;
	}
	
	
}
