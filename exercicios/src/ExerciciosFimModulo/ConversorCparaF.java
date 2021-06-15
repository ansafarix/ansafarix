package ExerciciosFimModulo;

import java.util.Scanner;

public class ConversorCparaF {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Entre com o valer em C para converter em F");
		double temp = entrada.nextDouble();
		
		
		double F = temp * (1.8) + 32; 
		
		System.out.printf("COnvertendo F para Celsus %.2f", F);
		
		
		
		entrada.close();
	
	}

}
