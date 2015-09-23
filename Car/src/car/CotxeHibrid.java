package car;

public class CotxeHibrid extends Cotxe {
	
	int kW;

	public int getkW() {
		return kW;
	}

	public void setkW(int kW) {
		this.kW = kW;
	}
	public double calcPotenciaFiscal() {
		return 0.08 * this.cilindres * Math.pow(this.cilindrada/this.cilindres, 0.6) * (this.kW / 200.0);
	}

}
