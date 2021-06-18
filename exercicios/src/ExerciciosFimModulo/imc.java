package ExerciciosFimModulo;

import java.util.Scanner;

public class imc {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o peso");
		float peso = entrada.nextFloat();
		
		System.out.println("Entre com a altura");
		float alt = entrada.nextFloat();
		
		float imc = peso / alt * alt ;
		

		
		System.out.println(imc);
	
		
	
		
		entrada.close();
	}
	

}
