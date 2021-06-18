package testes;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {
		
		int tabuada = 0;
		
		Scanner entrada = new Scanner(System.in);
	
		
		while (tabuada != -1) {
			
			System.out.println("\n Entre com a tabuada que deseja rodar"
					+ " ou digite [-1] para 'Sair' ");
			tabuada = entrada.nextInt();
			
			if (tabuada !=-1) { 
			
				for (int contador=0;contador<11;contador+=1) {
				
					
					int mult = tabuada * contador;
				
					System.out.printf(" \n %d x %d = %d", tabuada, contador, mult);
								
			    }
			} else {
				System.out.println("Ate logo");
			}
			
			
		}
		
		
		
		
		entrada.close();
	}
	
	
	
	
}
