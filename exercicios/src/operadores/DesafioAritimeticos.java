package operadores;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
		
		double a = Math.pow(Math.pow(6 * (3 +2), 2) / 3 *2 - Math.pow((1 - 5) * (2 - 7) / 2, 2) , 3) / Math.pow(10, 3);
		
		System.out.println(a);
		
		
		//expressao editada
		
		double exp1 = Math.pow(6 * (3+2),2) / 3*2;
		double exp3 = Math.pow((1 - 5) * (2 - 7) / 2, 2);
		double exp4 = Math.pow(exp1 -exp3, 3);
		double exp5 = Math.pow(10, 3);
		double exp6 = exp4 /exp5;
		
		System.out.println(exp6);
		
				
		
		
		
	}

}
