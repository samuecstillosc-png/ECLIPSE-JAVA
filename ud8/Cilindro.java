package ud8;

public class Cilindro extends Figura {
	
	private double altura;

	public Cilindro(String nombre, double radio, double altura) {
		super(nombre,altura);
		this.altura = altura;
		this.getNombre();
		
		
	}
	
	public double obtenerArea() {
		 int radio = 0;
		return 2 * obtenerArea() + 2 * Math.PI * radio * altura;
	}
	
	public double obtenerVolumen() {
		return obtenerArea() * altura;
		
	}

	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", obtenerArea()=" + obtenerArea() + ", obtenerVolumen()="
				+ obtenerVolumen() + "]";
	}
	
	


}
