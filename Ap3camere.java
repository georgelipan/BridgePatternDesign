package configurator_imobiliare;

public class Ap3camere extends Locuinte{
	int costLocuinta = 70000;
	int pretpachet = tipFinisaj.cost();
	int suma = costLocuinta + pretpachet;
	public Ap3camere(Finisaje finisaj) {
		super(finisaj);
	}
	
	
    public void afisareDetalii() { 
      
    	System.out.println("Locuinta Aleasa: Apartament 3 camere\nPret apartament 3 camere: 70.000 euro\n");

        tipFinisaj.pachetAles(); 
       
        tipFinisaj.garantie();

        tipFinisaj.etaj(); 

    }
    public void costTotal(){
        System.out.println("Costul total este de: " +suma+ "euro");
    }

}
