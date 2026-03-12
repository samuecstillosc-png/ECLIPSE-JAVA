package ud4;
import java.util.Scanner;

//9.Que lea 5 números por teclado los copie 
//a otro array multiplicados x2 y muestre el segundo array

public class Hoja4Ej9 {

	public static void main(String[] args) {
		// habilitamos entrada
		Scanner entrada=new Scanner(System.in);
		
		//definimos el array
		
		final int TAM = 5;
		int [] numeros=new int [5];
		int [] numerosPor2=new int [5];
		
		
		//rellenamos el primer array
		for (int i=0;i<5;i++) {
			System.out.println("Introduce numero: ");
			numeros[i]=entrada.nextInt();
			
		}
		
		//recorremos el primero y rellenamos el segundo
		for ( int i=0;i<5;i++) {
			numerosPor2[i]=2*numeros[i];
			
			
			
		}
		
        System.out.println("Números multiplicados x2:");
        for (int i = 0; i < 5; i++) {
            System.out.println( numeros[i] + ": " + numerosPor2[i]);	
            
        
        }

}
	
}
