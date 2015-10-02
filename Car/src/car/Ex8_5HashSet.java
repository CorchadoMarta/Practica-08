package car;

import java.util.HashSet;
import java.util.Iterator;

public class Ex8_5HashSet {

	public static void main(String[] args) {
		// 1: Create a HashSet
		HashSet<Cotxe> bossaCotxes = new HashSet<Cotxe>(5);

		// 2: Add 5 cars in HashSet
		bossaCotxes.add(new Cotxe("Alfa Romeo", "Giulia", 1900, 6));
		Cotxe dacia = new Cotxe("Dacia", "Sandero", 1200, 4);
		bossaCotxes.add(dacia);
		bossaCotxes.add(new Cotxe("Ford", "Focus", 2000, 4));
		bossaCotxes.add(new Cotxe("Opel", "Insignia", 2200, 4));
		Cotxe seat = new Cotxe("Seat", "Ibiza", 1400, 4);
		bossaCotxes.add(seat);

		// 3: Quina potència fiscal té Dacia Sandero?
		if (bossaCotxes.contains(dacia)) {
			System.out.println("La potencia fiscal del Dacia és " + dacia.getPotenciaFiscal());
		} else {
			System.out.println("Aquest cotxe no està ficat.");
		}

		System.out.println(" ");

		// 4: Add two cars
		System.out.println("Pots afegir Hyundai Atos 1500, 3 (nou)?");
		System.out.println(bossaCotxes.add(new Cotxe("Hyundai", "Atos", 1500, 3)));
		System.out.println("Ford Focus 2000,4 (duplicat)?");
		System.out.println(bossaCotxes.add(new Cotxe("Ford", "Focus", 2000, 4)));

		// 5: Pots afegir-hi duplicats? NO.

		// 6: Prova a inserir un “Audi A8, 4600, 8” a la posició 1. Pots?
		// No es pot perquè al hashSet no existeixen les posicions

		System.out.println(" ");

		// 7: Com pots substituir el Seat Ibiza per un “Seat Mii 1000 3”
		System.out.println("Com pots substituir el Seat Ibiza per un “Seat Mii 1000 3”");
		System.out.println("Primer l'eliminem, amb un remove, es pot?");
		System.out.println(bossaCotxes.remove(seat));
		System.out.println("Després afegim, es pot?");
		System.out.println(bossaCotxes.add(new Cotxe("Seat", "Mii", 1000, 3)));

		System.out.println(" ");

		// 8: Imprimeix totes les dades
		Iterator<Cotxe> setIterator = bossaCotxes.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}

		// 9: Estan ordenats?
		System.out.println("Els cotxes no surten ordenats, ja que no hi ha un ordre.");
	}
}
