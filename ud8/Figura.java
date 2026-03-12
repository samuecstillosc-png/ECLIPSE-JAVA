package ud8;

public  abstract class Figura {
	
	protected String nombre;
	
	public Figura (String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	
	public abstract double obtenerArea();
	
	public abstract double obtenerVolumen();
	
	public String toString() {
		return "Nombre: "+nombre+" Area"+obtenerArea()+" Volumen"+obtenerVolumen();
	}
	

}
