package ud7;

public class Vehiculo {
	
	public Vehiculo(boolean tieneMotor, int numeroRuedas, String color, String matricula) {
		super();
		this.tieneMotor = tieneMotor;
		this.numeroRuedas = numeroRuedas;
		this.color = color;
		this.matricula = matricula;
	}

	private boolean tieneMotor;
	private int numeroRuedas;
	
	private String color,matricula;
	
	
	

	public boolean isTieneMotor() {
		return tieneMotor;
	}

	public void setTieneMotor(boolean tieneMotor) {
		this.tieneMotor = tieneMotor;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [tieneMotor=" + tieneMotor + ", numeroRuedas=" + numeroRuedas + ", color=" + color
				+ ", matricula=" + matricula + "]";
	}
	
	
	

}
