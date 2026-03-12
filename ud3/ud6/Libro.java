package ud6;

public class Libro {
	
	private String libro;
	
	private String autor;
	
	private int numPaginas;
	
	private int calificacion;
	
	private static int TAM =10;
	
	public Libro (String libro, String autor, int numPaginas, int calificacion) {
		
		this.libro = libro;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.calificacion = calificacion;
	
}
	
	
	//getters
	
	public String getlibro () {
		return libro;
	}
	
	public String getautor () {
		return autor;
	}
	
	public int getnumPaginas () {
		return numPaginas;
	}
	
	//setters
	
	public int setCalificacion () {
		for (int i = 0;i<10;i++) {
			if (calificacion < 0) {
				System.out.println("Calificacion inválida, no puede ser menos que 0");
			}else if (calificacion > 10) {
				System.out.println("Calificación inválida, no puede ser mayor a 10");
				
				
			}
		}
		return calificacion;
	}
	
	public String toString() {
		String cad = "Libro:" +libro+ "Autor: "+autor+ "Número de Páginas: "+numPaginas+ 
				"Calificación: "+calificacion;
		
		return cad;
	
}
}