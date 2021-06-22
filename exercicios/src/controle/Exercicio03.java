package controle;

import java.util.Scanner;

public class Exercicio03 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota parcial");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Enre com a segunda nota parcial");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >=7 ) {			
			System.out.println("Aprovado");
		
		}else if (media < 7 && media > 4) {
			System.out.println("EM recuperação");
		}else {
			System.out.println("Reprovado");
		}
		
		
		
		
		System.out.printf("A media das notas é %.2f", media);
		
		
		
		
		entrada.close();
		
		
		
	}
	
	
}
