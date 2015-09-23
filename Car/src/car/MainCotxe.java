package car;

import java.util.Scanner;

public class MainCotxe {

	public static void main(String[] args) {
//		Cotxe c = new Cotxe(); 
//		Scanner entrada = new Scanner(System.in);
//		System.out.print("Introdueix la marca del cotxe: ");
//		c.setMarca(entrada.next());
//		System.out.print("Ara introdueix el model: ");
//		c.setModel(entrada.next());
//		System.out.print("Introdueix el nombre de cilindres: ");
//		c.setCilindrada(Integer.parseInt(entrada.next()));
//		System.out.print("Introdueix el nombre de cilindrada: ");
//		c.setCilindres((Integer.parseInt(entrada.next()));
//		c.calcPotenciaFiscal();
//		entrada.close();
		
		CotxeHibrid cH = new CotxeHibrid(); 
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introdueix la marca del cotxe: ");
		cH.setMarca(entrada.next());
		System.out.print("Ara Introdueix el model: ");
		cH.setModel(entrada.next());
		System.out.print("Introdueix el nombre de cilindres: ");
		cH.setCilindrada(entrada.nextInt());
		System.out.print("Introdueix el nombre de cilindrada: ");
		cH.setCilindres(entrada.nextInt());
		System.out.print("Introdueix els kW del motor: ");
		cH.setkW(Integer.parseInt(entrada.next()));
		cH.calcPotenciaFiscal();
		System.out.println("");
		System.out.println("El " + cH.marca + " " + cH.model + " té " + 
				String.valueOf(cH.potenciaFiscal) + " cavalls fiscals");
		entrada.close();
	}

}
