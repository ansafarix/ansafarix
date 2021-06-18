package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		int quantidadeDeNotas = 0;
		double nota =0; 
		double total=0;
		
		Scanner entrada = new Scanner(System.in);
		
			while(nota!=-1) {
				System.out.print("\n Entre com uma nota ou digite -1 para sair");
				nota = entrada.nextDouble();
				
				if(nota < 11 && nota >=0) {
					
					total+=nota;
					quantidadeDeNotas++;
					
					
				} else if (nota != -1) {
					System.out.println("Nota Invalida - :p");
				}
				
			
				
			}
				double media = total / quantidadeDeNotas;
			System.out.println("Média" + media);
				
			
		
		
		
		entrada.close();
		
		
		
	}

}
