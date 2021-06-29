package Classes;

import java.util.Scanner;

public class DataTeste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Data d1 = new Data();
		d1.ano = 2021;
		
				
		var d2 = new Data(31,12,2020);
		
		
		
		
		System.out.printf("O data escolhida foi %d de %s de %d", d1.dia, d1.mes, d1.ano);
		System.out.printf("O data escolhida foi %d de %s de %d", d2.dia, d2.mes, d2.ano);

		
		
		
		entrada.close();
		
	
}
}
