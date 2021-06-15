package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro salario ");
		String sal1 = entrada.nextLine().replace(',','.');
		
		System.out.println("Entre com o segundo salario ");
		String sal2 = entrada.nextLine().replace(',','.'); 
		
		System.out.println("Entre com o terceiro salario ");
		String sal3 = entrada.nextLine().replace(',','.');
		
		 
		double numero1 = Double.parseDouble(sal1);
		double numero2 = Double.parseDouble(sal2);
		double numero3 = Double.parseDouble(sal3);
		
		double soma = numero1 + numero2 + numero3;
		double media = (numero1 + numero2 + numero3) / 3;
		
		entrada.close();
			
		System.out.printf("A somados salario é %.2f, e a media é %.2f", soma, media);
		
		
		
		
	}

}
