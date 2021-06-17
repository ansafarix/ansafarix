package controle;

import java.util.Scanner;

public class DoWhile2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Digite sair para sair: ");
			valor = entrada.nextLine();
		}
		
		
		
		entrada.close();
	}

}
