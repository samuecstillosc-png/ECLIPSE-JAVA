package ud6;

public class Alumno {
	
	private String nombre;
	private double nota;
	
	public Alumno (String nombre, double nota) {
		
		this.nombre = nombre;
		this.nota = nota;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNombre() {
		this.nombre=nombre;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}

}
