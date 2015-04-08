package viaggi;

public class Avventura extends Pacchetto {
	private int dispersi;
	
	public Avventura(String ID, String descrizione, int postiTotali, int dispersi) {
		super(ID, descrizione, postiTotali);
		if(dispersi>=0)
			this.dispersi=dispersi;
		else
			throw new IllegalArgumentException("Il numero dei dispersi non può essere negativo");
	}

	public int getDispersi(){
		return this.dispersi;
	}

}
