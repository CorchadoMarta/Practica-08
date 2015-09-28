package car;

public class Cotxe {
	
	String marca;
	String model;
	int cilindrada;
	int cilindres;
	double potenciaFiscal;
	
	// Constructor
	
	public Cotxe () {
		
	}
	
	public Cotxe(String marca, String model, int cilindrada, int cilindres) {
		this.marca = marca;
		this.model = model;
		this.cilindrada = cilindrada;
		this.cilindres = cilindres;
		this.potenciaFiscal = calcPotenciaFiscal();
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getCilindres() {
		return cilindres;
	}
	public void setCilindres(int cilindres) {
		this.cilindres = cilindres;
	}
	public double getPotenciaFiscal() {
		return potenciaFiscal;
	}
	public void setPotenciaFiscal(double potenciaFiscal) {
		this.potenciaFiscal = this.calcPotenciaFiscal();
	}
	
	public double calcPotenciaFiscal () {
		return (0.08 * this.cilindres * Math.pow(this.cilindrada/this.cilindres, 0.6));
	}
	
	// Imprimeix les dades d'un dels cotxes
		public String toString(){
			return "El " + this.getMarca() + " " + this.getModel() + ", amb " + this.getCilindrada() + " de cilindrada y " 
							+ this.getCilindres() + " cilindres, té " + this.calcPotenciaFiscal() + " cavalls fiscals.";
		}

}
