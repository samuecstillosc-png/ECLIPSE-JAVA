package ud7;

public class Coche extends Vehiculo {
	
	private int cv;
	
	
	//constructor
	
	public Coche( String color, String matricula, int cv) {
		
		//construimos el vehiculo, llamamos al constructor de la clase padre, solo pasamos los que existan en vehiculo
		
		super(true, 4, color, matricula );
		
		this.cv=cv;
		
		
	}
	
	
	public int getCV() {
		return cv;
	}
	
	
	public void setCV(int cv) {
		this.cv=cv;
	}
	
	
	 {

}
	
}
