package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // implicita
				System.out.println(a);
				
		float b = (float) 1.123456788888; //explicita (CAST)
				System.out.println(b);
		
		int c = 340;
				System.out.println(c);
				
		byte d = (byte) c;
				System.out.println(d);
				
		double e = 1.9999999;
				System.out.println(e);
				
		int f = (int) e; 
				System.out.println(f);
	
				
	
	
	
	}
	
}
