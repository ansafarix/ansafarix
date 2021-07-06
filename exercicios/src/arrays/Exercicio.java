package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
	
		double [] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA.length -1);
		//System.err.println(notasAlunoA[4]); ERRO! nao pode ser maior q o array
		
		double totalAlunoA= 0;
		
		for (int i=0; i <notasAlunoA.length; i++) {
			totalAlunoA  += notasAlunoA[i];
		}

		double notaArmazenada = 5.0;
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		double [] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		
		double totalAlunoB = 0; 
		for (int i =0; i < notasAlunoB.length; i++) {
			
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
	
	
}
