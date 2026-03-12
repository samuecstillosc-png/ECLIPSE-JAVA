package ud6;

public class ConjuntoLibros {
	
	private Libro [] libros;
	
	private static final int TAM=10;
	private int contador = 0;
	
	public ConjuntoLibros () {
		libros = new Libro[10];
	
	

}
	
	public boolean añadirLibro (Libro nuevoLibro) {
		
		if (contador < 10) {
			libros[contador]=nuevoLibro;
			contador++;
			return true;
			
		}
		return false;
		
	}
	
	public boolean eliminarPortitulo (String titulo) {
		
		for (int i=0;i<titulo.charAt(i);i++) {
			if (libros[i].getlibro().equalsIgnoreCase(titulo)) {
				for (int j=i;j<contador;j++) {
					libros[j]=libros[j+1];
				}
				
				libros[contador-1] = null;
				contador--;
				return true;
			}
		}
		return false;
		
	}
	
}
