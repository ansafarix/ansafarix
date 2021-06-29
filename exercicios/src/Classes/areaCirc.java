package Classes;

public class areaCirc {
	
	double raio;
	final static double PI = 3.1415;
	
	
	areaCirc(double raioInicial){
		raio = raioInicial;
		
	}

	double area() {
		return PI * Math.pow(raio,2);
		
	}
	
}
