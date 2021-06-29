package Classes;

public class areaCircTeste {

	public static void main(String[] args) {
		areaCirc a1 = new areaCirc(10);
		a1.raio =10;
		
		
		areaCirc a2 = new areaCirc(5);
		a2.raio =100;
		//a2.pi = 0;
		
		//areaCirc.PI = 3.1415;
		
		
		System.out.println(a1.area());
		
		System.out.println(a2.area());
		System.out.println(areaCirc.PI);
		System.out.println(Math.PI);
	}
	
}
