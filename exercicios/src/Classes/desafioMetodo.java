package Classes;

public class desafioMetodo {
	int dia;
	int mes2;
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes2, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
		

}