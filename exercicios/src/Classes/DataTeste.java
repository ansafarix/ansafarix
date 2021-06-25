package Classes;

import java.util.Scanner;

public class DataTeste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Data d1 = new Data();
		
		System.out.println("Entre com um dia");
		d1.dia = entrada.nextInt();
		System.out.println("entre com o mes");
		d1.mes = entrada.next();
		System.out.println("Ano");
		d1.ano = entrada.nextInt();
		
	
		
		
		var d2 = new Data();
		
		System.out.println("\n Entre com um dia");
		d2.dia = entrada.nextInt();
		System.out.println("entre com o mes");
		d2.mes = entrada.next();
		System.out.println("Ano");
		d2.ano = entrada.nextInt();
		
		
		System.out.printf("O data escolhida foi %d de %s de %d", d1.dia, d1.mes, d1.ano);
		System.out.printf("O data escolhida foi %d de %s de %d", d2.dia, d2.mes, d2.ano);

		
		
		
		entrada.close();
		
	
}
}
