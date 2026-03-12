package ud8;

public class Libro {
	
	private String titulo;
	
	private String autor;
	
	private int numPaginas;
	
	private int calificacion;
	
	public Libro (String titulo, String autor, int numPaginas, int calificacion) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		setCalificacion(calificacion);
		
		
		
		
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}


	public void setCalificacion(int calificacion) {
		if (calificacion >= 0 && calificacion <= 10) {
			this.calificacion=calificacion;
				System.out.println("Calificación invalida");
				
			}
		
		
			
		}
	

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + ", calificacion="
				+ calificacion + "]";
	}


	
	

}
