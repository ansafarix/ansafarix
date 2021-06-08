package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//dados funcionarios
		// tipos numerico inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipos blooleano
		boolean estaDeFerias = false; // ou true
		
		// tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numeros de viagem
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + "ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status " + status);
		
		
		
		
	}

}
