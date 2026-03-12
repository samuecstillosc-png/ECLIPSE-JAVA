package ud3;

//18. Que escriba las tablas de multiplicar del 0 al 10.

public class Hoja2Ej18 {

	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		
		while (a<=10) {
			System.out.println("Tabla de multiplicar del "+a);
			System.out.println("----------------------------");
				b=0;
			while (b<=10) {
				System.out.println(a+"x"+b+"="+(a*b));
				b++;
			}
			a++;
		
		}
		

	}

}
