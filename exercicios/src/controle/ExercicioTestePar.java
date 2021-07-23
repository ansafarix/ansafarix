package controle;

import java.util.Scanner;

public class ExercicioTestePar {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um numero ");
		int numero = entrada.nextInt();
		
		if (numero % 2 == 0 && numero<= 10 && numero > 0) {
			System.out.println("Esse numero é par e esta entre 0 e 10" );
		
			
		} else if (numero % 2 != 0 && numero <=10 && numero >0  ) {
			System.out.println("Esse numero é impar e esta entre 0 e 10");
		
		} else if (numero % 2 == 0 && numero <10 ){
			System.out.println("o numero nao esta entre o e 10, mas é par");
		}	if (numero % 2 == 0 && numero > 10) {
			System.out.println("numero par, mas nao pertence ao numeros entre 0 e 10");
		}   else if (numero % 2 != 0 && numero > 10) {
			System.out.println("numero impar, nao pertence ao numeros entre 0 e 10");
		}
		
		
		
		entrada.close();
	}

}
