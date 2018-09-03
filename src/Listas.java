import java.util.ArrayList;
import java.util.List;

/*
 * https://docs.oracle.com/javase/10/docs/api/java/util/List.html
 * Alisson Youssf - Revisão emm 03/09/2018. 
 */
 
public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // Uma interface só pode ser instaciada com uma classe do tipo ArrayList, LinkedList...
		
		list.add("Maria Bethania");
		list.add("Gal Costa");
		list.add("Gilberto Gil");
		list.add("Caetano Veloso");
		list.add(2, "Chico Buarque");
		
		System.out.println(list.size()); // Tamanho da lista.
		
		// list.remove("Caetano Veloso"); // Removendo elemento da lista a partir da comparação do valor dele com outro.
		// list.remove(3); // Removendo pela posição
		
		for (String x : list) { //Pra cada String x pertencente à minha lista list, imprimir o valor de x.
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------------");
		
		// Remover todo mundo que começa com a letra G usando predicado. Função Lambda
		list.removeIf(x -> x.charAt(0) == 'G'); // Remove todo String x, tal que, x.charAt(0), na posição 0, ou seja, pega a 1a letra, seja igual a G.
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Index of Chico Buarque: " + list.indexOf("Chico Buarque")); // Encontra a posição de um elemento
		System.out.println("Index of Djavan: " + list.indexOf("Djavan")); // Caso não encontre retorna -1
	}
}
