package ud4;

import java.util.Scanner;

public class EjercicioParametroClase {
	
	static Scanner entrada = new Scanner(System.in);
	static final int TAM=3;
	public static void main(String[] args) {
        int[] nums = new int[TAM];

        System.out.println("1. Rellenar array");
        System.out.println("2. Multiplicar array por 2");
        System.out.print("Elige una opción: ");
        int opcion = entrada.nextInt();
		
		
		switch (opcion) {
			
		case 1: 
			rellenaArray(nums);
			System.out.println("Introduce los numeros");
			break;
			
		case 2: 
			multiplicaPorDos(nums);
			System.out.println("Multiplicar array por 2");
			break;
			
		}

	}
	
	
	//cabecera
	
	public static int [] rellenaArray (int [] nums) {
		
		System.out.println("Introduce "+ TAM +" numeros");
		for (int i=0;i<TAM;i++) {
			nums[i]=entrada.nextInt();
			
		}
		
		return nums;
		
	}
	
	public static int [] multiplicaPorDos (int [] nums) {
		int [] numsX2=new int [TAM];
		
		for (int i=0;i<TAM;i++) {
			numsX2[i]=nums[i]*2;
		}
		
		return numsX2;
	}

}
