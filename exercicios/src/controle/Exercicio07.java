package controle;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int somador = 0;
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		
		while (numero >= 0) {
			System.out.println("Entre com um numero");
			numero = entrada.nextInt(); 
			
			if (numero >= 1) {			
			somador += numero;
		}
		}	
		
		System.out.printf("A soma total é %d",  somador);
		
		
		entrada.close();
	}
	
	
}
