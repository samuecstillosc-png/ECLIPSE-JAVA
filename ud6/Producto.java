package ud6;

public class Producto {
	
	private String nombre;
	
	private double precio;
	
	private int stock;
	
	
	public Producto (String nombre, double precio, int stock) {
		
		this.nombre = nombre;
		
		this.precio = precio;
		
		this.stock = stock;
		
	}
	
	
	//getters
	
	public String getNombre () {
		return nombre;
	}
	
	public double getPrecio () {
		return precio;
	}
	
	public int getStock () {
		return stock;
	}
	
	public String toString() {
		String cad = "Nombre Producto: "+nombre+" Precio: "+precio+ " Stock: "+stock;
		
		return cad;

}
	
	//setters
	
	public void setDameNombre (String nombre) {
		
		this.nombre = nombre;
	}
	
	public void setPrecio (double precio) {
		this.precio = precio;
		
	}
	
	public void setStock (int Stock) {
		this.stock = stock;
	}

	
}


	
