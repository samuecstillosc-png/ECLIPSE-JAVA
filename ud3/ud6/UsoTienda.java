package ud6;

import java.util.Scanner;

public class UsoTienda {

	public static void main(String[] args) {
		
		Tienda tienda = new Tienda ();
		
		tienda.darAlta(new Producto("Patatas",1.1,100));
		
		tienda.darAlta(new Producto("Lápiz", 2,55));
		
		System.out.println(tienda);

		
		System.out.println(tienda.buscarProducto("patatas"));
		System.out.println(tienda.buscarProducto("peras"));
		
		System.out.println(tienda.modificarStock("patatas", 50));
		System.out.println(tienda);
		
		System.out.println(tienda.modificarStock("lapiz", 30));
	}

}
