package car;

import java.security.KeyStore.CallbackHandlerProtection;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex8_2MainCar {

	// Imprimeix les dades d'un dels cotxes
	public String mostraCotxe (Cotxe c){
		return "El " + c.marca + " " + c.model + ", amb " + c.cilindrada + " de cilindrada y " 
						+ c.cilindres + " cilindres, té " + c.calcPotenciaFiscal() + " cavalls fiscals";
	}
	
	public static void main(String[] args) {
		// 1: Create an ArayList 
		ArrayList<Cotxe> llistatCotxes = new ArrayList<Cotxe>(5);
		
		//2: Create 5 cars
		Cotxe c1 = new Cotxe(Alfa Romeo, Giulia, 1900, 6);
		Cotxe c2 = new Cotxe(Dacia, Sandero, 1200, 4);
		Cotxe c3 = new Cotxe(Ford, Focus, 2000, 4);
		Cotxe c4 = new Cotxe(Opel, Insignia, 2200, 4);
		Cotxe c5 = new Cotxe(Seat, Ibiza, 1400, 4);
		
		//Add 5 cars in ArrayList
		llistatCotxes.add(c1);
		llistatCotxes.add(c2);
		llistatCotxes.add(c3);
		llistatCotxes.add(c4);
		llistatCotxes.add(c5);
		
		// 3: Quina potencia fiscal te el cotxe nº2?
		llistatCotxes.get(2).calcPotenciaFiscal();
		
		// 4: Afegeix 2 objectes tipus Cotxe
		Cotxe c6 = new Cotxe(Hyundai, Atos, 1500, 3);
		llistatCotxes.add(c6);
		
		Cotxe c7 = new Cotxe (Ford, Focus, 2000,4);
		llistatCotxes.add(c7);
		
		// 5: Pots afegir duplicats?
		llistatCotxes.add(c1);
		
		// 6: Proba a inserir un cotxe a la posicio 1
		Cotxe c8 = new Cotxe(Audi, A8, 4600, 8);
		llistatCotxes.add(1, c8);
		
		// 7: Substitueix
		Cotxe c9 = new Cotxe(Seat, Mii, 1000, 3);
		llistatCotxes.set(4,c9);
		
		// 8: Quines posiciones té el ford focus?
		String posicions = "";
		int llistLenght = llistatCotxes.size();
		for (int i = 0; i < llistLenght; i++) {
			if (llistatCotxes.get(i).getMarca().contains("Focus")) {
				posicions = posicions + i + ", ";
			}
		}
		// 9: Imprimeix les dades de tots els cotxes
		// Bucle normal:
		for(int i = 0; i< llistLenght; i++){
			llistatCotxes.get(i).getMarca();
		}
		// For-each
		for (Cotxe c : llistatCotxes) {
			c.getMarca();
		}
		
		// Iterator
		Iterator<Cotxe> k = llistatCotxes.iterator();
			while (k.hasNext()) {
				System.out.println(k.next());
			}
	}

}
