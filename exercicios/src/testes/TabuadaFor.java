package testes;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		
		
		 Scanner entrada = new Scanner(System.in); 
			
		 System.out.println("Entre com a Tabuada");
			int tabuada = entrada.nextInt();
		
			entrada.close();
			
			for (int contador =0; contador <= 10; contador++) {{
				
				int mult = tabuada * contador;
				
				System.out.printf(" %d  x  %d = %d \n", tabuada,contador, mult);
				
			
			}
			
		
		
		
		
	
		
		
	}
	}
	}
