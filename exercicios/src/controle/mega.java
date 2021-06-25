package controle;

import java.util.Random;


public class mega {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		int numerosorteado1 = aleatorio.nextInt(61);
		int numerosorteado2 = aleatorio.nextInt(61);
		int numerosorteado3 = aleatorio.nextInt(61);
		int numerosorteado4 = aleatorio.nextInt(61);
		int numerosorteado5 = aleatorio.nextInt(61);
		int numerosorteado6 = aleatorio.nextInt(61);
		
		System.out.printf("os numeros sao %d, %d, %d,%d, %d, %d", numerosorteado1,numerosorteado2
				,numerosorteado3,numerosorteado4,numerosorteado5,numerosorteado6);
		
	}
	
}
