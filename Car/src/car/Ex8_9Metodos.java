package car;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map.Entry;

public class Ex8_9Metodos {

	public static class Metodos {
		
		//Metode que elimina cotxes dintre d'un SortedMap amb una cilindrada concreta
		public static boolean removeCar(SortedMap<String, Cotxe> mapa, int cilindrada) {
			// Creem un arraylist per a guardar les claus que cumpleixin la condició
			ArrayList<String> clau = new ArrayList<String>();
			// Recorrem el mapa
			for (Entry<String, Cotxe> entry : mapa.entrySet()) {
				// si la cilindrada del cotxe a mirar es major o igual a la que busquem la guardem a l'array
				if (entry.getValue().getCilindrada() >= cilindrada) {
					clau.add(entry.getKey());
				}
			}
			// Si el tamany de la clau es diferent a cero
			if (clau.size() != 0) {
				// Recorem el array
				for (String p : clau) {
					// eliminem el cotxe amb aquella clau del mapa
					mapa.remove(p);
				}
				return true;
			} else {
				return false;
			}
		}

		public static void main(String[] args) {
			// 1: Crear un sortedMap amb els cotxes
			SortedMap<String, Cotxe> mapCar = new TreeMap<String, Cotxe>();
			// 2: Add Items to the TreeMap
			mapCar.put(new String("1234 AAA"), new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
			mapCar.put(new String("2321 BBB"), new Cotxe("Seat", "Ibiza", 1200, 3));
			mapCar.put(new String("8232 FFF"), new Cotxe("Ford", "Focus", 2000, 4));
			mapCar.put(new String("3311 FFF"), new Cotxe("Ford", "Mondeo", 2200, 4));
			mapCar.put(new String("9381 LLL"), new Cotxe("Seat", "Leon", 1600, 4));
			mapCar.put(new String("B 9011 XC"), new Cotxe("Hyundai", "Atos", 1500, 3));
			mapCar.put(new String("9234 BHG"), new Cotxe("Hyundai", "Santa Fe", 3000, 6));
			mapCar.put(new String("9216 CKK"), new Cotxe("Hyundai", "Accent", 2000, 4));

			// Eliminem els cotxes amb cilindrada superior a 2500
			System.out.println(Metodos.removeCar(mapCar, 2500));

			// Imprimeix tots els cotxes
			for (Entry<String, Cotxe> entry : mapCar.entrySet()) {
				System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			}
		}
	}

}
