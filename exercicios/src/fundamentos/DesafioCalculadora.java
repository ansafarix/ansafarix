package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero");
		double num1 = entrada.nextDouble();
		
		System.out.println("Entre com o segundo numero");
		double num2 = entrada.nextDouble();
		
		System.out.println("Escolha o operador +, -, *, / ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		
		System.out.printf("A %s, entre %.2f e %.2f é %.2f ", op, num1, num2, resultado);
		
		
		
		
		
		entrada.close();
	}
}
