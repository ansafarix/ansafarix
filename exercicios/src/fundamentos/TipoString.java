package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(0)); //mostra a letra do caracter, no espaço solicitado no caso é o numero 0, vai aparecer a letra "o"
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa")); //começa com 
		System.out.println(s.toLowerCase().startsWith("boa")); // transforma a string em minuscula e checa se começa com "boa"
		System.out.println(s.length());//checa o comprimento de uma string
		System.out.println(s.endsWith("tarde")); //termina com
		System.out.println(s.equals("boa tarde")); //checa se é igual
		System.out.println(s.toLowerCase().equals("boa tarde")); //checa se é igual
		System.out.println(s.equalsIgnoreCase("boa tarde")); //ignora se é maiusculo e minusculo e checa se é iguall ao texto
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome " + nome + 
				"\n Sobrenome " + sobrenome + 
				"\n idade " + idade + 
				"\n salario " + salario ); 
		System.out.printf("O senhor %s %s tem %d e ganha R$ %.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d e ganha R$ %.2f", nome, sobrenome, idade, salario);
				
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("Frase"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6,8));
	}
	
}
