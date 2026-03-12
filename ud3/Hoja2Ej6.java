package ud3;

//6. Que imprima la suma de todos los números que van del 1 al 100

public class Hoja2Ej6 {

	public static void main(String[] args) {
		int cont=1;
		int suma=0;
		
		while (cont<=100) {
			suma=suma+cont;
			cont++;
		}
		System.out.println("La suma es:"+suma);
	}

}
