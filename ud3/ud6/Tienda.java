package ud6;

public class Tienda {
	
	private Producto [] productos;
	
	private int contador = 0;
	
	public Tienda () {
		productos = new Producto[10];
		contador = 0;
		
	}
	
	public boolean darAlta (Producto nuevoProducto) {
		if (contador < 10) {
			productos[contador] =nuevoProducto;
			contador++;
			return true;
		}
		return false;
	}
	
	public Producto buscarProducto (String prod) {
		for (int i=0;i<contador;i++) {
			Producto p=productos[i];
			if (prod.equals(productos[i].getNombre())) {
				return productos[i];
			}
			
		}
		return null;
		
	}
	
	public boolean modificarStock(String nombre, int stock) {
	    for (int i = 0; i < contador; i++) {
	        Producto p = productos[i]; // 
	        if (nombre.equals(p.getNombre())) {
	            p.setStock(stock);
	            return true; 
	        }
	    }
	    return false; 
	}
	
	public String toString() {
		String cad="";
		for(int i=0;i<contador;i++) {
			cad+=productos[i].toString()+"\n";
		}
		
		return cad;
	}
	
	public boolean borrarProducto (String nombre) {
		Producto p=buscarProducto(nombre);
		if(p==null) { //el producto no se encuentra
			return false;
		}
		
		p=null;
		contador--;
		return true;
	}
	

	
	
}
