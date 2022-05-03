package configurator_imobiliare;

public class mainpage {

	 public static void main(String[] args) {
		    Locuinte a1 = new Garsoniera(new Standard()); //vom crea un obiect de tipul garsoniera si vom alege pachetul standard
	        a1.afisareDetalii(); //vom afisa detaliile legate de 
	        a1.costTotal(); 
	        System.out.println("___________________________\n");
	        
	        Locuinte a2 = new Ap3camere(new Premium()); 
	        a2.afisareDetalii(); 
	        a2.costTotal(); 
	        System.out.println("___________________________\n");
	        
	        Locuinte a3 = new Penthouse(new Luxury()); 
	        a3.afisareDetalii(); 
	        a3.costTotal(); 
	        System.out.println("___________________________\n");
    	}

}
