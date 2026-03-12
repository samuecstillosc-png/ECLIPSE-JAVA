package ud4;

public class Hoja5Ej3 {
	
	
	//que muestre por pantalla los numeros del 1 al 100 utilizar recursividad

	public static void main(String[] args) {
		//zdv
		mostrarNumeros(1);

	}
	
	public static void mostrarNumeros (int n) {
		
		if (n==100) {
			System.out.println(100);
			
			
		} else {
			System.out.println(n);
			n++;
			mostrarNumeros(n);
		}
		
	}

}
