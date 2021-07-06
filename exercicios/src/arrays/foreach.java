package arrays;

public class foreach {
	
	public static void main(String[] args) {
	
		double[] notas = { 9.9, 8.7, 7.3, 9.4};
		
		for (int i=0; i < notas.length; i++) {
			System.out.println(notas[i] + " ");
		
		}
		
		for (double nota: notas) {
			System.out.print(nota + " ");
		}
		
		
	}

}
