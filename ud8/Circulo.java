package ud8;

public class Circulo extends Figura {
	
	private double radio;

	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio=radio;
	}
	
	public double obtenerArea() {
		
		return Math.PI*Math.pow(radio, radio); 
	}
	
	public double obtenerVolumen() {
		return 0;
		
	}
	

}



