package ud8;

public class Electrodomestico {

    protected final static String COLOR_DEF = "blanco";
    protected final static char CONSUMO_DEF = 'F';
    protected final static double PRECIO_BASE_DEF = 100;
    protected final static double PESO_DEF = 5;

    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_DEF, COLOR_DEF);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, CONSUMO_DEF, COLOR_DEF);
    }

    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public double getPrecioBase() { return precioBase; }
    public String getColor() { return color; }
    public char getConsumoEnergetico() { return consumoEnergetico; }
    public double getPeso() { return peso; }


    private void comprobarConsumoEnergetico(char letra) {
    	

        char letraMayus = Character.toUpperCase(letra);
        if (letraMayus >= 'A' && letraMayus <= 'F') {
            this.consumoEnergetico = letraMayus;
        } else {
            this.consumoEnergetico = CONSUMO_DEF;
        }
    }

    private void comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        this.color = COLOR_DEF; 

        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                this.color = colores[i];
                break; 
            }
        }
    }


    public double precioFinal() {
        double plus = 0;

        switch (this.consumoEnergetico) {
            case 'A': plus += 100; break;
            case 'B': plus += 80; break;
            case 'C': plus += 60; break;
            case 'D': plus += 50; break;
            case 'E': plus += 30; break;
            case 'F': plus += 10; break;
        }

        if (peso >= 0 && peso <= 19) {
            plus += 10;
        } else if (peso >= 20 && peso <= 49) {
            plus += 50;
        } else if (peso >= 50 && peso <= 79) {
            plus += 80;
        } else if (peso >= 80) {
            plus += 100;
        }

        return this.precioBase + plus;
    }
}
		
	

	 
	
