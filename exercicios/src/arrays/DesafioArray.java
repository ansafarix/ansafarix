package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Quantas notas vc quer trabalhar?");
			int quantidade = entrada.nextInt();
			
			double[] notas = new double [quantidade];
			
			double total =0;
		
			for (int i =0; i < notas.length; i++) {
				
				System.out.println("Entre com uma nota");
				notas[i] = entrada.nextDouble();
								
				total += notas[i];
				
				
			}
			System.out.println(Arrays.toString(notas));
			System.out.print("\n A nota será: ");
			System.out.print(total/quantidade);
			
			
			
			entrada.close();
		}
	
}
