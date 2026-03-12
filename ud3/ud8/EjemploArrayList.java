package ud8;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		// Definimos una coleccion
		//ponemos dentro de <> el tipo, solo es de obejetos
		
		ArrayList<Integer> numeros;
		
		//construimos la coleccion numeros
		
		numeros = new ArrayList<Integer>(); //lista vacia
		
		System.out.println(numeros);
		
		//añadimos numeros 
		
		numeros.add(5);
		numeros.add(10);
		numeros.add(445);
		
		System.out.println(numeros);
		
		//mostramos todos los array list
		
		for (int i =0;i<numeros.size();i++) { //con size no length
			System.out.println(numeros.get(i));
			
		}
		
		//si queremos ver que hay algun elemento o no
		
		System.out.println(numeros.contains(5)); //ponemos contains para comprobar si esta el numero en la lista 
		
		//queremos saber en que posicion está el 10
		
		System.out.println(numeros.indexOf(10)); //con index of
		
		//para borrar toda la coleccion
		
		numeros.clear();
		System.out.println(numeros);
		
		
		//para borrar va por indice tenemos que indicarle cual
		
		numeros.remove(0);

	}

}
