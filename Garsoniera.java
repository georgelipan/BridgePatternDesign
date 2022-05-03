package configurator_imobiliare;

public class Garsoniera extends Locuinte{
	int costLocuinta = 30000;
	int pretpachet = tipFinisaj.cost();
	int suma = costLocuinta + pretpachet;
	
	public Garsoniera(Finisaje finisaj) {
		super(finisaj);
	}
	
    public void afisareDetalii() { 
       
    	System.out.println("Locuinta Aleasa: Garsoniera\nPret garsoniera: 30.000 euro\n");
    	
        tipFinisaj.pachetAles(); 
       
        tipFinisaj.garantie();
      
        tipFinisaj.etaj(); 

    }
    public void costTotal(){
        System.out.println("Costul total este de: " +suma +" euro");
    }
}
