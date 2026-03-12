package ud3;

import java.util.Scanner;

//23. Que solicite la media de X números, se dejarán de solicitar números hasta que se
//introduzca el cero

public class Hoja2Ej23 {

	public static void main(String[] args) {
		//habilitamos lectura 
		
			Scanner entrada = new Scanner(System.in); {
			//zdv
			int cont=-1,suma=0,numLeido=1;
			double media;
			
			while (numLeido != 0) {
				System.out.println("Introduce un numero para la media");
				//leemos el numero entero
				numLeido=entrada.nextInt();
				
				suma=suma+numLeido;
				cont++;
			}
			
			media=(double)suma/cont; 
			System.out.println("La media es " +media);{
				
			}
			
			if (numLeido == 0) {
				System.out.println("No se puede calcular");
					
				}
			
			
			}
		
	
	}
	
}


