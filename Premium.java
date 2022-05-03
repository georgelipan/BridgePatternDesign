package configurator_imobiliare;

import java.util.Random;

public class Premium implements Finisaje {
	Random etj = new Random();
	int rezultat = etj.nextInt(5-0) + 0;
	int costPachet = 20000;
	
	public void pachetAles() {
		System.out.println("Pachet ales: Premium\nPret pachet: 20.000 euro\n");
	}
	
	public int cost() {
		int cost= costPachet;;
		return cost;
	}
	
	
	
	public void garantie() {
		System.out.println("Garantia lucrarilor oferita pentru pachetul Premium: 15 ani");
	}
	
	public void etaj() {
		if(rezultat == 0) 
			System.out.println("Amplasare: parter\n");
		else
			System.out.println("Amplasare: etaj "+rezultat+"\n");
		
	}
}
