package configurator_imobiliare;

import java.util.Random;

public class Luxury implements Finisaje{
	Random etj = new Random();
	int rezultat = etj.nextInt(5-0) + 0;
	int costPachet = 40000;
	
	public void pachetAles() {
		System.out.println("Pachet ales: Luxury\nPret pachet: 40.000 euro\n");
	}
	
	public int cost() {
		int cost= costPachet;;
		return cost;
	}
	
	
	
	public void garantie() {
		System.out.println("Garantia lucrarilor oferita pentru pachetul Premium: 20 ani");
	}
	
	public void etaj() {
		if(rezultat == 0) 
			System.out.println("Amplasare: parter");
		else
			System.out.println("Amplasare: etaj "+rezultat+"\n");
		
	}
	
}
