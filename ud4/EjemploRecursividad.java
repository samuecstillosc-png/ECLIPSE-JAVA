package ud4;

public class EjemploRecursividad {

	public static void main(String[] args) {
		int num=2;
		
		System.out.println("El factorial de "+num+" es "+factorial(num));


	}
	
	public static int factorial (int n) {
		
		
		
		if (n==0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
		
		
	}

	
	

	}




