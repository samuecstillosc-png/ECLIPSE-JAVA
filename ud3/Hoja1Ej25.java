package ud3;

import java.util.Scanner;

// TODO Auto-generated method stub
/*25. Que calcule el sueldo que le corresponde al trabajador de una empresa que cobra
40.000 euros anuales, el programa debe realizar los cálculos en función de los
siguientes criterios:
a. Si lleva más de 10 años en la empresa se le aplica un aumento del 10%.
b. Si lleva menos de 10 años pero más que 5 se le aplica un aumento del 7%.
c. Si lleva menos de 5 años pero más que 3 se le aplica un aumento del 5%.
d. Si lleva menos de 3 años se le aplica un aumento del 3%.*/

public class Hoja1Ej25 {

	public static void main(String[] args) {
		try (//habilitamos lectura
		Scanner entrada = new Scanner(System.in)) {
			//ZDV
			int antig;
			double salarioBase=0,salario=0;
			
			//pedir años y sueldo
			System.out.println("Introduce antigüedad");
			//leemos entero
			antig=entrada.nextInt();
			System.out.println("Introduce salario base");
			//leemos salario
			salarioBase=entrada.nextDouble();
			//calculamos el salario
			//a. Si lleva más de 10 años en la empresa se le aplica un aumento del 10%.
			
			if (antig>=10) {
				salario=salarioBase*1.1;
			}
			//b. Si lleva menos de 10 años pero más que 5 se le aplica un aumento del 7%.
			
			if ((antig<10)&&(antig>=5)) {
				salario=salarioBase*1.07;
			}
			//c. Si lleva menos de 5 años pero más que 3 se le aplica un aumento del 5%.
			
			if ((antig<5)&&(antig>=3)) {
				salario=salarioBase*1.05;
			}
			//d. Si lleva menos de 3 años se le aplica un aumento del 3%.*/
			
			if (antig<3) {
				salario=salarioBase*1.03;
			}
			
			//mostramos el sueldo
			
			System.out.println("El salario es:"+salarioBase);
		}
		
		
	}

}
