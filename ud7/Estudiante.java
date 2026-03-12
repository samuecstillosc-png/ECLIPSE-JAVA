package ud7;

public class Estudiante extends Persona{
		
	private String curso;


	public Estudiante(String nombre, String apellidos, String estadoCivil, String dNI, String curso) {
		super(nombre, apellidos, estadoCivil, 0);
		this.curso = curso;
	}
	
	public double calculaSalario() {
		return 0;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString()+" Curso: "+curso;
	}
	
	
	
}
