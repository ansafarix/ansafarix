package ExerciciosFimModulo;

import java.util.Scanner;

public class quadradoEcubo {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		double n = entrada.nextDouble();
		
		double quadrado = Math.pow(n, 2);
		double cubo = Math.pow(n, 3);
		
		System.out.printf("o quadrado do nume %.2f é %.2f e o cubo é %.2f ", n,quadrado,cubo);
		
		
		entrada.close();
		
	}
	
	
}
