package configurator_imobiliare;

public class Penthouse extends Locuinte{
	int costLocuinta = 100000;
	int pretpachet = tipFinisaj.cost();
	int suma = costLocuinta + pretpachet;
	public Penthouse(Finisaje finisaj) {
		super(finisaj);
	}
	
    public void afisareDetalii() { 
      
    	System.out.println("Locuinta Aleasa: Penthouse\nPret penthouse: 100.000 euro\n");

        tipFinisaj.pachetAles(); 
       
        tipFinisaj.garantie();

      
        tipFinisaj.etaj(); 

    }
    public void costTotal(){
        System.out.println("Costul total este de: " +suma);
    }
}
