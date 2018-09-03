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
		
		list.remove("Caetano Veloso"); // Removendo elemento da lista a partir da comparação do valor dele com outro.
		
		for (String x : list) { //Pra cada String x pertencente à minha lista list, imprimir o valor de x.
			System.out.println(x);
		}
		
		
	}
}
