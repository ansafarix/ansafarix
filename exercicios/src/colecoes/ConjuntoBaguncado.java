package colecoes;

import java.util.HashSet;
import java.util.Set;

import com.sun.tools.classfile.Opcode.Set;

public class ConjuntoBaguncado {
	
	private static boolean add;

	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {
	
		HashSet conjunto = new HashSet();
		
		add = conjunto.add(1.2); //double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); Uniao entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
	}

}
