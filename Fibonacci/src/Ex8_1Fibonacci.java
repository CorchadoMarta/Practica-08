import java.util.ArrayList;
import java.util.Iterator;

public class Ex8_1Fibonacci {

	public static void main(String[] args) {
		// 1: Declare the array list with 25 positions initial
		ArrayList<Integer> seqfibonacci = new ArrayList<Integer>(26);

		System.out.println("----- \n For normal \n -----");

		// 2: Afegir seqüència fibonacci
		// Add the first position with 0
		seqfibonacci.add(0);
		System.out.println("En la 0 posició hi ha: " + seqfibonacci.get(0));
		// Add in the second position a 1
		seqfibonacci.add(1);
		System.out.println("En la 1 posició hi ha: " + seqfibonacci.get(1));
		// 3: Do a loop introducing the fibonacci sequence and print
		for (int i = 2; i < 25; i++) {
			seqfibonacci.add(seqfibonacci.get(i - 1) + seqfibonacci.get(i - 2));
			System.out.println("En la " + i + " posició hi ha: " + seqfibonacci.get(i));
		}

		System.out.println("----- \n For each \n -----");

		// Do for each
		for (Integer j : seqfibonacci) {
			System.out.println("En la posició " + seqfibonacci.indexOf(j) + " hi ha " + j);
		}

		System.out.println("----- \n Iterator \n -----");

		// Iterator
		Iterator<Integer> k = seqfibonacci.iterator();
		while (k.hasNext()) {
			System.out.println(k.next());
		}
		// 4: position of value
		System.out.println("\n Determina la posició del valor 2584");
		System.out.println("La seva posició és " + seqfibonacci.indexOf(2584));
		
		// 5: found a value
		System.out.println("\n Hi es el valor 4311?");
		if (seqfibonacci.indexOf(4311) == -1) {
			System.out.println("El valor 4311 NO apareix a la sequencia fibonacci.");
		} else {
			System.out.println(
					"El valor 4311 SI apareix a la sequencia fibonacci en la posició " + seqfibonacci.indexOf(2584));
		}

	}
}
