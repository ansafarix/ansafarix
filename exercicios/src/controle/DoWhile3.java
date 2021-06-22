package controle;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		

		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			
			System.out.println("Digite sair para poder sair do sistema");
			System.out.println("Quer sair?: ");
			texto = entrada.nextLine();
			
		} while (!texto.equalsIgnoreCase("sair")); 
		
			System.out.print("Obridado");
		
		entrada.close();

	
	}
}
