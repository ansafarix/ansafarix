package fundamentos;


public class Temperatura {
	
	public static void main(String[] args) {
		
		//(F - 32) * 5/9 = C
		
		final double FATOR = 32;
		final double MULTIPLICADOR = 5.0/9;
		double f,c;
	
		
		System.out.println("Entre com a temperatura a ser convertida");
		
				
				f = 86;
	
				c = (f - FATOR) * MULTIPLICADOR;
				
				System.out.println("O valor em Celsius é: " + c + "ºC");
				
				f = 100;
				c = (f - FATOR) * MULTIPLICADOR;
				
				System.out.println("O valor em Celsius é: " + c + "ºC");

				
						
		
	}

}
