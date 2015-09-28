package car;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex8_2ArrayList {

	public static void main(String[] args) {
		// 1: Create an ArayList
		ArrayList<Cotxe> llistatCotxes = new ArrayList<Cotxe>(5);

		// 2: Add 5 cars in ArrayList
		llistatCotxes.add(new Cotxe("Alfa Romeo", "Giulia", 1900, 6));
		llistatCotxes.add(new Cotxe("Dacia", "Sandero", 1200, 4));
		llistatCotxes.add(new Cotxe("Ford", "Focus", 2000, 4));
		llistatCotxes.add(new Cotxe("Opel", "Insignia", 2200, 4));
		llistatCotxes.add(new Cotxe("Seat", "Ibiza", 1400, 4));

		// 3: Quina potencia fiscal te el cotxe nº2?
		System.out.println(llistatCotxes.get(2).calcPotenciaFiscal());

		// 4: Afegeix 2 objectes tipus Cotxe
		llistatCotxes.add(new Cotxe("Hyundai", "Atos", 1500, 3));
		llistatCotxes.add(new Cotxe("Ford", "Focus", 2000, 4));

		// 5: Pots afegir duplicats? Si
		Cotxe c1 = new Cotxe("Alfa Romeo", "Giulietta", 2100, 6);
		llistatCotxes.add(c1);
		llistatCotxes.add(c1);

		// 6: Proba a inserir un cotxe a la posicio 1
		llistatCotxes.add(1, new Cotxe("Audi", "A8", 4600, 8));

		// 7: Substitueix
		llistatCotxes.set(4, new Cotxe("Seat", "Mii", 1000, 3));

		// 8: Quines posiciones té el ford focus?
		String posicions = "";
		int llistLenght = llistatCotxes.size();
		for (int i = 0; i < llistLenght; i++) {
			if (llistatCotxes.get(i).getMarca().contains("Ford") && llistatCotxes.get(i).getModel().contains("Focus")) {
				posicions = posicions + i + " - ";
			}
		}
		System.out.println(posicions);

		// 9: Imprimeix les dades de tots els cotxes
		// Bucle normal:
		for (int i = 0; i < llistLenght; i++) {
			System.out.println(llistatCotxes.get(i));
		}

		// For-each
		for (Cotxe c : llistatCotxes) {
			System.out.println(c);
		}

		// Iterator
		Iterator<Cotxe> k = llistatCotxes.iterator();
		while (k.hasNext()) {
			System.out.println(k.next());
		}
	}

}
