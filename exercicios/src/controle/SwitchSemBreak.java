package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
	
	String faixa = "verde";
	//sem o break; ele executa todos comandos abaixo
	
	switch (faixa.toLowerCase()) {
	case "preta":
		System.out.println("Sei o Bassai-Dai...");
	case "marrom":
		System.out.println("Sei o Tekki Shodan");
	case "roxa":
		System.out.println("Sei o Hian Godan");
	case "verde":
		System.out.println("Sei o heian Yodan");
		break;
		
	default:
		System.out.println("Nao sei de nada");
		
	}
System.out.println("FIM!!!!");

	int idade = 2;
	switch (idade) {
	case 3: 
		System.out.println("Sabe programar");
	case 2: 
		System.out.println("Sabe falar");
	case 1: 
		System.out.println("Sabe andar");
	case 0: 
		System.out.println("Sabe Programar");
	}
	
	
	
	}
}