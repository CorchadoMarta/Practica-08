/*
 * Program.java        13-10_2015
 *
 * Mapa de Cotxes.
 *
 * Copyright 2015 Marta Corchado <gcatram@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package car;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map.Entry;

public class Ex8_9Metodos {

	public static class Metodos {

		/**
		 * METHOD DESCRIPTION Metode que elimina cotxes dintre d'un SortedMap
		 * amb una cilindrada concreta
		 * 
		 * @param mapa
		 *            is a SortedMap
		 * @param cilindrada
		 *            is an integer
		 * @return a boolean si ha pogut eliminar
		 */
		public static boolean removeCar(SortedMap<String, Cotxe> mapa, int cilindrada) {
			// Creem un arraylist per a guardar les claus que cumpleixin la
			// condició
			ArrayList<String> clau = new ArrayList<String>();
			// Recorrem el mapa
			for (Entry<String, Cotxe> entry : mapa.entrySet()) {
				// si la cilindrada del cotxe a mirar es major o igual a la que
				// busquem la guardem a l'array
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

		/**
		 * METHOD DESCRIPTION Metode que que guarda en un array els cotxes amb
		 * uns determinats cilindres
		 * 
		 * @param mapa
		 *            is a SortedMap
		 * @param cilindres
		 *            is an integer
		 * @return a ArrayList amb els cotxes que cumpleixin la condicio
		 */
		public static ArrayList<Cotxe> getCotxesCilindres(SortedMap<String, Cotxe> mapa, int cilindres) {
			// Creem un arraylist per a guardar els cotxes que cumpleixin la
			// condició
			ArrayList<Cotxe> llistatCotxes = new ArrayList<Cotxe>();
			// Recorrem el mapa
			for (Entry<String, Cotxe> entry : mapa.entrySet()) {
				// si els cilindres del cotxe a mirar son els demanats el
				// guardem a l'array
				if (entry.getValue().getCilindres() == cilindres) {
					llistatCotxes.add(entry.getValue());
				}
			}
			// Mirem que l'arrayList no estigui buit
			if (llistatCotxes.isEmpty()) {
				return null;
			} else {
				// Si no esta buit que retorni l'array
				return llistatCotxes;
			}
		}

		/**
		 * METHOD DESCRIPTION Metode que retorni els noms dels cotxes guardats
		 * per marca
		 * 
		 * @param mapa
		 *            is a SortedMap
		 * @return a SortedMap amb els cotxes ordenats per marca
		 */
		public static SortedMap<String, ArrayList<Cotxe>> guardatPerMarca(SortedMap<String, Cotxe> mapa) {
			// Creem un arraylist per a guardar les marques dels cotxes
			ArrayList<String> llistatMarques = new ArrayList<String>();
			// Recorrem el mapa per a guardar les marques en l'arrayList
			for (Entry<String, Cotxe> entry : mapa.entrySet()) {
				// Guardem el cotxe en una variable
				Cotxe marca = entry.getValue();
				// Si la marca no esta ja guardada a l'array la guardem
				if (!llistatMarques.contains(marca.getMarca())) {
					llistatMarques.add(marca.getMarca());
				}
			}
			// Creem el SortedMap que anem a retornar
			SortedMap<String, ArrayList<Cotxe>> mapCar = new TreeMap<String, ArrayList<Cotxe>>();
			// Introduim les marques guardades al mapa creat fent un for
			for (int i = 0; i < llistatMarques.size(); i++) {
				// Guardem la marca que estem mirant en aquell moment en la
				// variable
				String marca = llistatMarques.get(i);
				// Creem l'arrayList de Cotxes on guardarem els cotxes amb una
				// mateixa marca
				ArrayList<Cotxe> llistatCotxe = new ArrayList<Cotxe>();
				// Recorem el mapa per trobar els cotxes amb la mateixa marca i
				// guardar-los a l'array
				for (Entry<String, Cotxe> cotxe : mapa.entrySet()) {
					// Agafem nomes els cotxes de la marca actual
					if (cotxe.getValue().getMarca() == marca) {
						llistatCotxe.add(cotxe.getValue());
					}
				}
				// Un cop tenim tots els cotxes d'una marca ho afegim tot al SortedMap
				mapCar.put(marca, llistatCotxe);
			}
			// Retornem el mapa creat
			return mapCar;
		}

		/**
		 * METHOD DESCRIPTION Metode per jugar amb els cotxes
		 * 
		 */
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

			// Guardem els cotxes amb 6 cilindres
			System.out.println(Metodos.getCotxesCilindres(mapCar, 4));

			//Mostrem el metode guardat oer marques
			System.out.println(Metodos.guardatPerMarca(mapCar));
			
			// Imprimeix tots els cotxes
			for (Entry<String, Cotxe> entry : mapCar.entrySet()) {
				System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			}
		}
	}

}
