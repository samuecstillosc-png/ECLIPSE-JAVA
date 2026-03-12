package ud6;

// Crea una clase Tiempo con atributos HORA, MINUTO, SEGUNDO,  que pueda
//ser construida indicando los tres atributos, solo la hora y minuto o solo la hora.
//crear ademas los metodos necesarios para modificar la hora en cualquier momento
//de forma manual. Y crea una clase de tipo PRUEBATIEMPO que prueba una hora concreta
//y la modifica.

public class Tiempo {
	
	//atributos
	
	private int hora,minuto,segundo;
	
	public Tiempo (int h, int m,int s) {
		
		this.cambiaHora(h);
		
		this.cambiaMinuto(m);
		
		this.cambiaSegundo(s);
		
	}
	
				

	
	public Tiempo(int h, int m) {
		this(h,m,0);
	}
	
	public Tiempo (int h) {
		this(h,0,0);
	}
		
		
	
	
	//metodos getters

	public String toString() {
		return hora+":"+minuto+":"+segundo;
	}
	
	
	
	//metodos setters 
	
	public void cambiaHora(int h) {
		if (hora>= 0 && hora <=23) {
		hora=h;
		}else 
			hora=0;
		}
	
		
	public void cambiaMinuto(int m) {
		if (minuto>= 0 && minuto <=59) {
		minuto=m;
		
		}else 
			minuto=0;
		}
	
	
		
	public void cambiaSegundo(int s) {
		if (s>= 0 && s <=59) {
		segundo=s;
		
		}else 
			segundo=0;
	
}
	
	public void añadeSegundo () {
		this.cambiaMinuto(minuto+1);
		if (minuto>= 0 && minuto <=59) {
			minuto++;
			
			
		}
	}
	}

	


