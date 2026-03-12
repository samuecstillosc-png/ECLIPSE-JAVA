package ud6;

public class Fraccion {
	
	private int num,den;
	
	public Fraccion (int num, int den) {
		
		this.num = num;
		this.den = den;
		
	}
	
	
	// getters
	
	public int dameDenominador() {
		return den;
	}
	
	public int dameNumerador() {
		return num;
	}
	
	public Fraccion multiplica(Fraccion f2) {
        return new Fraccion(this.num * f2.dameNumerador(), this.den * f2.dameDenominador());
	}
	
	public Fraccion divide (Fraccion f2) {
		return new Fraccion(num*f2.dameDenominador(),
				den*f2.dameNumerador());
		
	}
	
	public Fraccion suma (Fraccion f2) {
		int n = this.num+f2.dameNumerador() + (this.den*f2.num);
		int d = this.den+f2.dameDenominador();
		Fraccion rsdo = new Fraccion(n,d);
		return rsdo;
	}
	
	public Fraccion resta (Fraccion f2) {
		int n = this.num-f2.dameNumerador();
		int d = this.den-f2.dameDenominador();
		Fraccion rsdo = new Fraccion(n,d);
		return rsdo;
		
	}
	
	
	
	

	
	
	public String toString () {
		return this.num+"/"+this.den;
	}
}
