package DesafioComida;



public class jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijao", 0.300);
		
		Pessoa p = new Pessoa("JAO", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
		
		
		
		
	}

}
