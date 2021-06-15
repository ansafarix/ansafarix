package fundamentos;

import java.util.Scanner;

public class teste1 {
	
	public static void main(String[] args) {
	
	
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Entre com um numero ");
			int n1 = entrada.nextInt();
		
			System.out.print("Entre com um outro numero ");
			int n2 = entrada.nextInt();
		
			int total = n1 + n2;
		
			System.out.print(total);
		
			entrada.close();
		
		
	}

}
