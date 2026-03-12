package ud6;

public class UsoCoche {

	public static void main(String[] args) {
		
		
		// Construyo un objeto de tipo coche
		
		Coche bmw = new Coche ("abc123","100 cv","azul");
		
		System.out.println("Numero de ruedas: "+bmw.dameRuedas());
		bmw.estableceColor("azul");
		
		System.out.println("Color: "+bmw.dameColor());
		
		System.out.println("Matricula: "+bmw.dameMatricula());
		
		bmw.arrancar();
		bmw.pitar();

	}

}
