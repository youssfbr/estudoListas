import java.util.ArrayList;
import java.util.List;

/*
 * https://docs.oracle.com/javase/10/docs/api/java/util/List.html
 * Alisson Youssf - Revis�o emm 03/09/2018. 
 */
 
public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // Uma interface s� pode ser instaciada com uma classe do tipo ArrayList, LinkedList...
		
		list.add("Maria Bethania");
		list.add("Gal Costa");
		list.add("Gilberto Gil");
		list.add("Caetano Veloso");
		list.add(2, "Chico Buarque");
		
		System.out.println(list.size()); // Tamanho da lista.
		
		// list.remove("Caetano Veloso"); // Removendo elemento da lista a partir da compara��o do valor dele com outro.
		// list.remove(3); // Removendo pela posi��o
		
		for (String x : list) { //Pra cada String x pertencente � minha lista list, imprimir o valor de x.
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------------");
		
		// Remover todo mundo que come�a com a letra G usando predicado. Fun��o Lambda
		list.removeIf(x -> x.charAt(0) == 'G'); // Remove todo String x, tal que, x.charAt(0), na posi��o 0, ou seja, pega a 1a letra, seja igual a G.
		
		for (String x : list) {
			System.out.println(x);
		}
	}
}
