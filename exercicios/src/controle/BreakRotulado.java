package controle;



public class BreakRotulado {

	public static void main(String[] args) {
	
		externo: for (int i = 0; i < 5; i++) { //colocando nome no for observar pois se char pelo nome vc define o break
			for (int j = 0; j < 5; j++) {
				if (i ==1) {
					break externo;
				}
				System.out.printf("%d %d",i,j);
			}
			System.out.println();
		}
		System.out.println("Fim");
}
	
	
}
