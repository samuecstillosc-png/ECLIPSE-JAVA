package ud6BIS;

public class Persona {
    private String dni;
    private Cuenta[] cuentas;
    private int numCuentasAsociadas;

    public Persona(String dni) {
        this.dni = dni;
        this.cuentas = new Cuenta[3];
        this.numCuentasAsociadas = 0;
    }

    public boolean addCuenta(Cuenta cuenta) {
        if (numCuentasAsociadas >= 3)
            return false;

        cuentas[numCuentasAsociadas] = cuenta;
        numCuentasAsociadas++;
        return true;
    }

 
    public boolean esMorosa() {
        for (int i = 0; i < numCuentasAsociadas; i++) {
            if (cuentas[i].dameSaldo() < 0) {
                return true;
            }
        }
        return false;
    }
	
	//metodos getters
	
	public String toString() {
		String cad ="dni: "+dni+"\n"+"Cuentas:";
		for (int i=0;i<numCuentasAsociadas;i++) {
			cad+=cuentas[i].toString();
		}
		
		return cad;
	}
	
	public Cuenta dameCuenta(String numC) {
		for (int i =0;i<numCuentasAsociadas;i++) {
			if (numC.equals(cuentas[i].dameCuenta())) {
				return cuentas[i];
			}
		}
		
		return null;
	}
	
}
		

