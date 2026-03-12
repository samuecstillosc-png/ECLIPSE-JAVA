package ud4;

public class Hoja4Ej1 {
	
	//Que rellene un array con los 100 primeros numeros enteros y los muestre en orden ascendente

	public static void main(String[] args) {
		//constantes
		final int TAM=100;
		//definimos el array
		int [] numeros=new int [TAM];
		//reservamos ram
		numeros=new int [100];
		//zdv
		int i = 0;
		int num=1;
		//guardamos los numeros en el array
		for (i=0;i<TAM;i++) {
			numeros[i] = num;
			num++;
		}
		
		//mostramos el array
		
		for (i=0;i<TAM;i++) {
			System.out.println(numeros[i]);
			
		}

	}

}
