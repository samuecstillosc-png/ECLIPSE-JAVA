package ud5;

import java.util.Random;

public class Ej11Notas {
	
	//11. Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la
	//forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de
	//suspensos, el número de suficientes, el número de bienes, etc.

	public static void main(String[] args) {
		String[] nota = {"suspenso", "suficiente", "bien", "notable", "sobresaliente"};
		int [] cantidadDeNotas = new int [nota.length];
		Random genAle = new Random();
		
        for (int i = 0; i < 20; i++)  {
        	int notaAle=genAle.nextInt(nota.length);
            cantidadDeNotas[notaAle]++;
	}
        
        for (int i=0;i<nota.length;i++) {
        	System.out.println(nota[i]+":"+cantidadDeNotas[i]);
        }
}
	
}
