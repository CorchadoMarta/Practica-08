package car;

import java.util.Comparator;

public class LlistaComparable implements Comparator<Cotxe> {
		
		@Override
		public int compare(Cotxe a, Cotxe b) {
			
			// Compare Potencia Fiscal de mes petit a més gran
			if (a.getPotenciaFiscal() > b.getPotenciaFiscal())
				return 1;
			if (a.getPotenciaFiscal() < b.getPotenciaFiscal())
				return -1;			
			return 0;
		}
	}