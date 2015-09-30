package car;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Ex8_4PriorityQueue {

	public static void main(String[] args) {
		// 1: Clonar LinkedList
		// Create a LinkedList
		LinkedList<Cotxe> llistatCotxes = new LinkedList<>();

		// Add 5 cars in LinkedList
		llistatCotxes.offer(new CotxeComparable("Alfa Romeo", "Giulia", 1900, 6));
		llistatCotxes.offer(new CotxeComparable("Dacia", "Sandero", 1200, 4));
		llistatCotxes.offer(new CotxeComparable("Ford", "Focus", 2000, 4));
		llistatCotxes.offer(new CotxeComparable("Opel", "Insignia", 2200, 4));
		llistatCotxes.offer(new CotxeComparable("Seat", "Ibiza", 1400, 4));

		// Clone lifoAutos and fifoAutos
		LinkedList<Cotxe> lifoAutos = (LinkedList<Cotxe>) llistatCotxes.clone();
		LinkedList<Cotxe> fifoAutos = (LinkedList<Cotxe>) llistatCotxes.clone();

		// 2: Create a priority queue
		PriorityQueue<Cotxe> prioQueue = new PriorityQueue<Cotxe>();
		// Introduim els valors a la priority queue
		for (Cotxe c : lifoAutos) {
			prioQueue.offer(c);
		}
		// Compare
		while (!prioQueue.isEmpty()){
			System.out.println(prioQueue.poll().toString());
		}

	}
}