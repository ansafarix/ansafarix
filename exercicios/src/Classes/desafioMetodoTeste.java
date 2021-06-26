package Classes;

import java.util.Scanner;

public class desafioMetodoTeste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		desafioMetodo d1 = new desafioMetodo();
		
		System.out.println("Entre com um dia");
		d1.dia = entrada.nextInt();
		System.out.println("entre com o mes");
		d1.mes2 = entrada.nextInt();
		System.out.println("Ano");
		d1.ano = entrada.nextInt();
		
	
		
		
		var d2 = new desafioMetodo();
		
		System.out.println("\n Entre com um dia");
		d2.dia = entrada.nextInt();
		System.out.println("entre com o mes");
		d2.mes2 = entrada.nextInt();
		System.out.println("Ano");
		d2.ano = entrada.nextInt();
		
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());

		d1.imprimirDataFormatada();
		
		
		entrada.close();
		
	
}

}
