package car;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Ex8_4PriorityQueue {

	public static void main(String[] args) {
		// 1: Clonar LinkedList
		// Create a LinkedList
		LinkedList<CotxeComparable> llistatCotxes = new LinkedList<>();

		// Add 5 cars in LinkedList
		llistatCotxes.offer(new CotxeComparable("Alfa Romeo", "Giulia", 1900, 6));
		llistatCotxes.offer(new CotxeComparable("Dacia", "Sandero", 1200, 4));
		llistatCotxes.offer(new CotxeComparable("Ford", "Focus", 2000, 4));
		llistatCotxes.offer(new CotxeComparable("Opel", "Insignia", 2200, 4));
		llistatCotxes.offer(new CotxeComparable("Seat", "Ibiza", 1400, 4));

		// Clone lifoAutos and fifoAutos
		LinkedList<CotxeComparable> lifoAutos = (LinkedList<CotxeComparable>) llistatCotxes.clone();
		LinkedList<CotxeComparable> fifoAutos = (LinkedList<CotxeComparable>) llistatCotxes.clone();

		// 2: Create a priority queue
		PriorityQueue<CotxeComparable> prioQueue = new PriorityQueue<CotxeComparable>();
		// Introduim els valors a la priority queue
		for (CotxeComparable c : lifoAutos) {
			prioQueue.offer(c);
		}
		// Compare
		while (!prioQueue.isEmpty()){
			System.out.println(prioQueue.poll());
		}
		
		// 3: Insert a new car
		lifoAutos.addFirst(new CotxeComparable("Fiat", "Panda", 900, 2));
		fifoAutos.addLast(new CotxeComparable("Fiat", "Panda", 900, 2));
		prioQueue.offer(new CotxeComparable("Fiat", "Panda", 900, 2));
		
		// Create a new queue
		PriorityQueue<CotxeComparable> prioQueue2 = new PriorityQueue<CotxeComparable>();
		// Introduim els valors a la priority queue
		for (CotxeComparable c : lifoAutos) {
			prioQueue2.offer(c);
		}
		int count = 1;
		// 4: Show lifo and fifo queues sorted
		while (!prioQueue2.isEmpty()){
			System.out.println(count++);
			System.out.println(lifoAutos.poll());
			System.out.println(fifoAutos.poll());
			System.out.println(prioQueue2.poll());
		}
		
		// 5: Posa un exemple de la vida real de cadascun dels dos tipus de cues.
		// Exemple de cua FIFO és la cua a la peixateria.
		// Exemple de cua LIFO és una pila de gots/plats emmagatzemats a l'armari.

	}
}