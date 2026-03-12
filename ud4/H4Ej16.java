package ud4;

public class H4Ej16 {
	
	//16. Que muestre los primeros 100 números de izquierda a derecha usando un
	//array de dos dimensiones.

	public static void main(String[] args) {
		// definimos el array
		
		int [][] matriz = new int [10][10];
		int numeros = 1;
		
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				matriz [i][j] = numeros;
				numeros++; 
				
			}
		}
		
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				System.out.print(matriz[i][j]+" ");
		
	}
		
		System.out.println();

	}

		
		
	}
	
}

