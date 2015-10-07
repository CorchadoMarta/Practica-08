package car;

import java.util.SortedMap;
import java.util.TreeMap;

public class Ex8_9Metodos {
	
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
	}
	
	public static class metodos{
		public boolean removeCar(){
			return false;
		}
	}
}
