package configurator_imobiliare;

public abstract class Locuinte{
	protected Finisaje tipFinisaj;
	public Locuinte(Finisaje finisaj) {
		this.tipFinisaj = finisaj;
	}
	
	abstract public void afisareDetalii();
	abstract public void costTotal();
}
