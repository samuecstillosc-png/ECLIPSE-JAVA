package ud6BIS;

public class PruebaCuentas {

	public static void main(String[] args) {
		
		Persona p1 = new Persona ("1234a");
		Cuenta c1 = new Cuenta ("ES1234567890");
		Cuenta c2 = new Cuenta("ES12345678910");
		
		//aqui estamos poniendo los 700 de la segunda, en la primera empieza en 0 por defecto
		
		c2.recibirAbonos(700);
		
		//asociamos las cuentas
		
		p1.addCuenta(c1);
		p1.addCuenta(c2);
		
		//recibe ingresos
		
		c1.recibirAbonos(1100);
		c2.pagarRecibos(750);
		
		//vemos si es morosa 
		
		System.out.println(p1.toString());
		System.out.println("La persona es morosa? "+p1.esMorosa());
		
		//transferencia
		
		c1.pagarRecibos(100);
		c2.recibirAbonos(1000);
		
		//comprobamos la trasnferencia
		
		System.out.println("Estado de la cuenta: ");
		System.out.println(p1.toString());
		System.out.println("Es morosa ahora? "+p1.esMorosa());
		
		
		
		
		
		
		
		


	}

}
