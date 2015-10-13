package car;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex8_6LinkedHashSet {

	public static void main(String[] args) {
		// 1: Create a LinkedHashSet
		LinkedHashSet<Cotxe> bossaCarLHS = new LinkedHashSet<Cotxe>(5);

		// Add 5 cars in LinkedHashSet
		bossaCarLHS.add(new Cotxe("Alfa Romeo", "Giulia", 1900, 6));
		Cotxe dacia = new Cotxe("Dacia", "Sandero", 1200, 4);
		bossaCarLHS.add(dacia);
		bossaCarLHS.add(new Cotxe("Ford", "Focus", 2000, 4));
		bossaCarLHS.add(new Cotxe("Opel", "Insignia", 2200, 4));
		Cotxe seat = new Cotxe("Seat", "Ibiza", 1400, 4);
		bossaCarLHS.add(seat);

		// 2: Add 2 cars
		System.out.println("Pots afegir Hyundai Atos 1500, 3 (nou)?");
		System.out.println(bossaCarLHS.add(new Cotxe("Hyundai", "Atos", 1500, 3)));
		System.out.println("Ford Focus 2000,4 (duplicat)?");
		System.out.println(bossaCarLHS.add(new Cotxe("Ford", "Focus", 2000, 4)));

		// 3: Pots afegir-hi duplicats? NO.
		System.out.println(" ");

		// 4: Imprimeix totes les dades
		Iterator<Cotxe> setIterator = bossaCarLHS.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		
		// 5: Quin ordre hi tenim? Quin tipus de “cua” és?
		System.out.println(" ");
		System.out.println("Ens ho imprimeix en l'ordre amb el que ehm introduït les dades. Per tant és una cua FIFO");


	}

}
