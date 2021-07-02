package testes;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d = new Data();
		
		var d2 = new Data(23,04,2000);
		
		
		System.out.printf("O data escolhida foi %d de %s de %d", d.dia, d.mes, d.ano);
		System.out.printf("O data escolhida foi %d de %s de %d", d2.dia, d2.mes, d2.ano);

	}
}
