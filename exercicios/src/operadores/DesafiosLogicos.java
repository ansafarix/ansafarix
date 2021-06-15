package operadores;

public class DesafiosLogicos {
	
	public static void main(String[] args) {
	
		boolean trabalho1 = true; //mudando pra false pra ver q acontece
		boolean trabalho2 = true;
		
		
		boolean caso1 = trabalho1 && trabalho2;
		String caso11 = Boolean.toString(caso1).replaceAll("true", " comprou").replaceAll("false", " nao comprou");
		
		boolean caso2 = trabalho1 || trabalho2;
		String caso22 = Boolean.toString(caso2).replaceAll("true"," comprou").replaceAll("false", " nao comprou");
		
				
		boolean caso3 = !trabalho1 && !trabalho2;
		String caso33 = Boolean.toString(caso3).replaceAll("false", "nao comprou").replaceAll("false", " nao comprou");
		
		boolean caso4 = trabalho1 || trabalho2;
		
		
		System.out.println("sorvete e tv 50' " + caso11);
		System.out.println("sorvete e tv 32' " + caso22);
		System.out.println("Sem sorvete sem tvs, so que saudavel" + caso33);
		System.out.println("sim comprou sorvete " + caso4);
		

		
		
	}
	
	
	
	
}
