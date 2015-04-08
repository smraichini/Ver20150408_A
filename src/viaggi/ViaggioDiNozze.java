package viaggi;

public class ViaggioDiNozze extends Pacchetto {
	private int divorzi;

	public ViaggioDiNozze(String ID, String descrizione, int postiTotali, int divorzi) {
		super(ID, descrizione, postiTotali);
		if(divorzi>=0)
			this.divorzi=divorzi;
		else
			throw new IllegalArgumentException("Il numero dei divorzi non pu� essere negativo");
	}

	public int getDivorzi(){
		return this.divorzi;
	}

	
}
