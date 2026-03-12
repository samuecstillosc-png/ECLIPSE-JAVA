package ud6BIS;

public class Cuenta {
    private String numCuenta;
    private double saldo; 

    public Cuenta(String numCuenta) {
        this.numCuenta = numCuenta;
        this.saldo = 0;
    }

   
    public double consultaSaldo() {
        return this.saldo;
    }

    public boolean recibirAbonos(double abono) {
        if (abono > 0) {
            saldo += abono;
            return true;
        }
        return false;
    }

    public void pagarRecibos(double recibo) {
        saldo -= recibo;
    }

    public String toString() {
        return " Cuenta: " + numCuenta + " Saldo: " + saldo;
    }

    public String dameCuenta() {
        return numCuenta;
    }

    public double dameSaldo() {
        return saldo;
    }
}