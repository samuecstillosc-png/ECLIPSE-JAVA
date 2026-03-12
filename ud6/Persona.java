package ud6;

import java.util.Random;

public class Persona {
    
    // Constantes 
    public static final char SEXO_DEF = 'H';
    public static final int INFRAPESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;
    
    // Atributos
    private String nombre;
    private String DNI;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    // Constructores
    
    public Persona() {
    
        this("", 0, SEXO_DEF, 0, 0);
    }
    
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }
    
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(sexo); 
        this.DNI = generaDNI();
    }
    
    // Métodos públicos
    public int calcularIMC() {
  
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return INFRAPESO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }
    
    public boolean esMayordeEdad() {
        return edad >= 18; 
    }


    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | DNI: " + DNI + 
               " | Sexo: " + sexo + " | Peso: " + peso + "kg | Altura: " + altura + "m";
    }

    // Métodos privados
    
    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEF;
        } else {
            this.sexo = sexo;
        }
    }
    
    private String generaDNI() {
        Random genAle = new Random();
        int numDNI = genAle.nextInt(90000000) + 10000000;
        char letra = calculaLetraDNI(numDNI);
        return Integer.toString(numDNI) + letra;
    }
    
    private char calculaLetraDNI(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(dni % 23);
    }
    
    // Setters
    public void setNombre(String nombre) { 
    	this.nombre = nombre; }
    public void setEdad(int edad) { 
    	this.edad = edad; }
    public void setSexo(char sexo) { 
    	comprobarSexo(sexo); } 
    public void setPeso(double peso) { 
    	this.peso = peso; }
    public void setAltura(double altura) { 
    	this.altura = altura; }
}
	
	
	

















