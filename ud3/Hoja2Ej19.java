package ud3;

import java.util.Scanner;

//19. Que muestre la tabla de multiplicar de un número cualquiera

public class Hoja2Ej19 {

	public static void main(String[] args) {
		//zdv
		int numero;
		int cont=1;
		//Habilitamos lectura
		Scanner entrada=new Scanner(System.in);
		
		
		//mostramos lo que queremos
		System.out.println("De que numero quieres sacar la tabla de multiplicar");
		//leemos entero
		numero=entrada.nextInt();
		
		
		//ponemos lo que queremos hacer
		numero=numero * cont;
		while (cont!=10) {
			System.out.println(numero + "x" +cont+ "=" + (cont * numero));
			cont++;
		}
		

	}

}
