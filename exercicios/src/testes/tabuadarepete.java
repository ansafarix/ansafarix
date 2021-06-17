package testes;

import java.util.Scanner;

public class tabuadarepete {
	
	public static void main(String[] args) {
		
	
		
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			
			System.out.println("\n Aperte algo para rodar ou escreva 'sair' para sair ");
			valor = entrada.next();
				
			
			System.out.println("Entre com a Tabuada");
			int tabuada = entrada.nextInt();
						
		
			
			for (int contador =0; contador <= 10; contador++) {
				
				int mult = tabuada * contador;
				
				System.out.printf("\n %d  x  %d = %d \n", tabuada,contador, mult);
				
				System.out.println("\n Digite sair para sair: ");
				valor = entrada.next();
			}	
			
				
			
			
			
		}
		
		
		
		entrada.close();
	}

}

