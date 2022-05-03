package configurator_imobiliare;

import java.util.Random;

public class Standard implements Finisaje{
	Random etj = new Random();
	int rezultat = etj.nextInt(5-0) + 0;
	
	int costPachet = 10000;
	public void pachetAles() {
		System.out.println("Pachet ales: Standard\nPret pachet: 10.000 euro\n");
	}
	
	public int cost() {
		int cost= costPachet;;
		
		return cost;
	}
	
	
	
	public void garantie() {
		System.out.println("Garantia lucrarilor oferita pentru pachetul Standard: 10 ani");
	}
	
	public void etaj() {
		if(rezultat == 0) 
			System.out.println("Amplasare: parter");
		else
			System.out.println("Amplasare: etaj "+rezultat+"\n");
		
	}
}
