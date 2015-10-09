package car;

import java.util.TreeSet;

public class Ex8_7treeSet {

	public static void main(String[] args) {
		// 1: Creï sis TreeSets que suportin 6 objectes de tipus cotxe com hem
		// creat abans
		// a.Dues més amb amb un comparador per cilindrada.
		TreeSet<CotxeComparable> treeComparadorCilindradaA = new TreeSet<CotxeComparable>();
		TreeSet<CotxeComparable> treeComparadorCilindradaB = new TreeSet<CotxeComparable>();
		// b.Dues més amb un comparador per pot. fiscal.
		LlistaComparable comparadorPot = new LlistaComparable();
		TreeSet<Cotxe> treeComparadorPotA = new TreeSet<Cotxe>(comparadorPot);
		TreeSet<Cotxe> treeComparadorPotB = new TreeSet<Cotxe>(comparadorPot);

		// Add 5 cars in TreeSet Comparator classA
		treeComparadorCilindradaA.add(new CotxeComparable("Alfa Romeo", "Giulia", 1900, 6));
		treeComparadorCilindradaA.add(new CotxeComparable("Dacia", "Sandero", 1200, 4));
		treeComparadorCilindradaA.add(new CotxeComparable("Ford", "Focus", 2000, 4));
		treeComparadorCilindradaA.add(new CotxeComparable("Opel", "Insignia", 2200, 4));
		treeComparadorCilindradaA.add(new CotxeComparable("Seat", "Ibiza", 1400, 4));

		// Add 5 cars in TreeSet Comparator classB
		treeComparadorCilindradaB.addAll(treeComparadorCilindradaA);

		// Add 5 cars in TreeSet Comparator Potencia classA
		treeComparadorPotA.addAll(treeComparadorCilindradaA);

		// Add 5 cars in TreeSet Comparator Potencia classB
		treeComparadorPotB.addAll(treeComparadorCilindradaA);

		// 2: Extreu amb criteri “lifo” els elements d’una de les llistes a i b
		System.out.println("----FIFO Compare Cilindrada--------");
		while (!treeComparadorCilindradaA.isEmpty()) {
			System.out.println(treeComparadorCilindradaA.pollFirst());
		}
		System.out.println("----FIFO Compare Potencia Fiscal--------");
		while (!treeComparadorPotA.isEmpty()) {
			System.out.println(treeComparadorPotA.pollFirst());
		}
		// 3: Extreu amb criteri “fifo” els elements d’una de les llistes a i b
		System.out.println("----LIFO Compare Cilindrada--------");
		while (!treeComparadorCilindradaB.isEmpty()) {
			System.out.println(treeComparadorCilindradaB.pollLast());
		}
		System.out.println("----LIFO Compare Potencia Fiscal--------");
		while (!treeComparadorPotB.isEmpty()) {
			System.out.println(treeComparadorPotB.pollLast());
		}
	}

}
