package ud6;

public class Rectangulo {
	
	//encapsulamos los atributos con el private
	
	private double base, altura;
	
	
	
	//metodo constructor
	
	public Rectangulo (double b, double h) {
		base=b;
		altura=h;
	}

	
	
	//metodos getter
	
	public double calculaArea() {
		double area = base*altura;
		return area;
	}
	
	public double calculaPerimetro() {
		return 2*(base+altura);
	}
	
	
	//metodos setters
	
	public void cambiaBase (double nuevaBase) {
		base = nuevaBase;
	}
	
	
	
	
	

}
