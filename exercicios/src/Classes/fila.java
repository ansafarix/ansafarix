package Classes;

import java.util.LinkedList;
import java.util.Queue;


public class fila {
	public static void main(String[] args) {
		
		//offer e add => adicionam elementos na fila
		//A diferença é o comportamento quando a fila esta cheia
		
		
		Queue<String> fila = new LinkedList<String>();
		fila.add("Ana"); //retorna false 
		fila.offer("Bia"); // lança um excessao /fila com limites tipo 10 users
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o proximo elemnto da fila (sem remover)
		//Diferença é o comportamento ocorre quando a fila esta vazia
		
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança exceção
		System.out.println(fila.element());
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		//fila.contains(fila)
		
		
		//Poll e Remove -> obter o proximo elemento da fila e remove
		// Diferença é o comportamento ocorre
		//Quando a fila esta vazia
		
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); //lança exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // lança exceão

	}

}
