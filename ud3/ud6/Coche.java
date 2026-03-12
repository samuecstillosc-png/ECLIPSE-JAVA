package ud6;

public class Coche {
	
	// encapsulamos atributos, con el private
	
	private int ruedas;
	private String motor,color,matricula;
	
	
	
	//métodos contructores, llevamos el objeto a un estado inicial
	
	public Coche(String mat, String mot, String col) {
		ruedas=4;
		
		//asignamos al atributo matricula el valor que pasamos por parámetro (mat)
		
		matricula=mat;
		
		
	}
	
	//metodo getters: permite LEER el valor de un atributo desde fuera de la clase
	
	
	public int dameRuedas() {
		return ruedas;
	}
	
	public String dameColor() {
		return color;
	}
	
	public String dameMatricula() {
		return matricula;
	}
	
	public void arrancar() {
		System.out.println("Has arrancado!");
	}
	
	public void frenar() {
		System.out.println("Has frenado!");
	}
	
	public void pitar() {
		System.out.println("PI PI PI");
	}
	
	
	//metodo setters: permite MODIFICAR o ESCRIBIR el valor de un atributo desde fuera de la clase
	
	public void estableceColor(String nuevoColor) {
		color=nuevoColor;
	}
}

