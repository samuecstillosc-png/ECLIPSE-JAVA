package ud5;

import java.util.Random;

public class Ej15EjAleatorios {
	
	//15. Realiza un simulador de máquina tragaperras.

	public static void main(String[] args) {
		String[] figuras = {"corazon", "diamante", "herradura", "campana", "limón"};
		Random genAle = new Random();
		String [] resultado = new String [3];
		//mostramos solo 3 figuras
		
		for (int i=0;i<3;i++) {
        	resultado [i] = figuras[genAle.nextInt(figuras.length)];
            System.out.print(resultado[i] + " ");
            
            
            
		}
		
		
		System.out.println();
            
            if (resultado[0].equals(resultado[1]) &&
            	resultado[1].equals(resultado[2])) {

            	System.out.println("Enhorabuena, ha ganado 10 monedas");
            	
            } else if (resultado[0].equals(resultado[1])||
            		resultado[0].equals(resultado[2])
            		||resultado[1].equals(resultado[2])) {
            	
            	System.out.println("Bien, ha recuperado su moneda");

            	
            }else {
            	System.out.println("Lo siento ha perdido");
            
           
			
		}
		
	}

}
