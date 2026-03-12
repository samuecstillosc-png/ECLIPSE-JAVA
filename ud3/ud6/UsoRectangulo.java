package ud6;

public class UsoRectangulo {

	public static void main(String[] args) {
		
		//lo creamos
		
		Rectangulo r1 = new Rectangulo (2,3);
		Rectangulo r2 = new Rectangulo (5,6);
		
		//para calcularlo
		
		System.out.println("R1: ");
		
		System.out.println("Area: "+r1.calculaArea());
		
		System.out.println("Perimetro: "+r1.calculaPerimetro());
		
		
		r1.cambiaBase(5);
		
		
		System.out.println("R2: ");
		
		System.out.println("Area: "+r2.calculaArea());
		
		System.out.println("Perimetro: "+r2.calculaPerimetro());
	}

}
