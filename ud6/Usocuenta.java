package ud6;

public class Usocuenta {

	public static void main(String[] args) {
		// la creamos 
		
		Cuenta c1 = new Cuenta ("Alberto");
		
		c1.setcantidad(100);
		
		c1.ingresar(50);
		
		System.out.println(c1.toString());
		c1.ingresar(-25);
		System.out.println(c1.toString());
		
		c1.retirar(25);
		System.out.println(c1.toString());
		
		c1.retirar(200);
		System.out.println(c1.toString());
		

	}

}
