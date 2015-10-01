package car;

public class CotxeComparable extends Cotxe implements Comparable<Object>{
	
	public CotxeComparable(String marca, String model, int cilindrada, int cilindres) {
		super(marca, model, cilindrada, cilindres);
	}
	
	@Override
	public int compareTo(Object obj) {
		// Create a car
		Cotxe that = (Cotxe) obj;
		
		// Save cilindrada in a variable
		int cilindradaA = this.getCilindrada();
		int cilindradaB = that.getCilindrada();
		
		// de mes petit a més gran
		if (cilindradaA > cilindradaB)
			return 1;
		if (cilindradaA < cilindradaB)
			return -1;			
		return 0;
	}
}
