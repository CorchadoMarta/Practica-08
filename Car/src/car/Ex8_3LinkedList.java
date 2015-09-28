package car;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex8_3LinkedList {

	public static void main(String[] args) {
		// 1: Create a LinkedList
		LinkedList<Cotxe> llistatCotxes = new LinkedList<>();

		// 2: Add 5 cars in LinkedList
		llistatCotxes.offer(new Cotxe("Alfa Romeo", "Giulia", 1900, 6));
		llistatCotxes.offer(new Cotxe("Dacia", "Sandero", 1200, 4));
		llistatCotxes.offer(new Cotxe("Ford", "Focus", 2000, 4));
		llistatCotxes.offer(new Cotxe("Opel", "Insignia", 2200, 4));
		llistatCotxes.offer(new Cotxe("Seat", "Ibiza", 1400, 4));
		
		// 3.a: Afegeix un cotxe al principi
		llistatCotxes.addFirst(new Cotxe("Hyundai", "Atos", 1500, 3));
		
		// 3.b: Afegeix un cotxe al final
		llistatCotxes.addLast(new Cotxe("Ford", "Focus", 2000, 4));
		
		// 4: Pots afegir duplicats? Si
		Cotxe c1 = new Cotxe("Alfa Romeo", "Giulietta", 2100, 6);
		llistatCotxes.add(c1);
		llistatCotxes.add(c1);
		
		// 5: Proba a inserir un cotxe a la posicio 1
		llistatCotxes.add(1, new Cotxe("Audi", "A8", 4600, 8));
		
		// 6: Substitueix
		llistatCotxes.set(4, new Cotxe("Seat", "Mii", 1000, 3));
		
		// 7: Elimina el primer element
		llistatCotxes.pollFirst();
		
		// 8: Quines posicions ocupa el Hyundai? Com després l'em eliminat fent pollFirst buscaré un Seat
		String posicions = "";
		int llistLenght = llistatCotxes.size();
		for (int i = 0; i < llistLenght; i++) {
			if (llistatCotxes.get(i).getMarca().contains("Seat")) {
				posicions = posicions + i + " - ";
			}
		}
		System.out.println(posicions);

		// Iterator
		Iterator<Cotxe> k = llistatCotxes.iterator();
		while (k.hasNext()) {
			System.out.println(k.next());
		}
	}
}
