package operadores;

public class DesafioLogicoResolvido {
	
	public static void main(String[] args) {
	
		//trabalho na terca (V ou F)
		//trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho2 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		
		//operador unario
		boolean maisSaudavel = !comprouSorvete;
		
		
		System.out.println("Comprou TV 50 \" " + comprouTV50);
		System.out.println("Comprou TV 32 \" " + comprouTv32);
		System.out.println("Comprou Sorvete \" " + comprouSorvete);
		System.out.println("Mais saudavel \" " + maisSaudavel);
		
		
		
	}

}
