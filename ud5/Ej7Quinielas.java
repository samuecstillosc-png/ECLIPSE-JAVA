package ud5;

import java.util.Random;

public class Ej7Quinielas {

    public static void main(String[] args) {
        char [] rsdo = {'1','X','2'};
        Random genAle = new Random();
        
        // Imprimir números de partido
        for (int j = 0; j < 14; j++)  {
            System.out.print((j+1) + ". ");
        
        
        // Generar resultado para cada partido
        for (int i = 0; i < 3; i++) {
            int pos = genAle.nextInt(3);
            System.out.print(rsdo[pos] + " ");
        }
        System.out.println();
    	}
    	//pleno al 15
    	char [] rsdo2= {'0','1','2','M'};
    	System.out.println("15."+rsdo2[genAle.nextInt(4)]+"-"+rsdo2[genAle.nextInt(4)]);
    
    
	}



}