package ExerciciosFimModulo;

import java.util.Scanner;

public class ConversorFparaC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com os graus F para converter para C");
		double f = entrada.nextDouble();
		
		double c = (f - 32) / 1.8;
		
		System.out.printf(" %.2f F é equivalente a %.2f C ", f,c);
		
		
		entrada.close();
	}

}
