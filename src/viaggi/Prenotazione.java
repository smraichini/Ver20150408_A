package viaggi;

public class Prenotazione {
	private String ID;
	private int posti;
	
	public Prenotazione(String ID, int posti, Cliente c) {
		if(ID.length()>0)
		this.ID=ID;
		else
		throw new IllegalArgumentException("L'ID non pu� avere lunghezza 0 (caratteri)");
		
		if(posti>=0)
		this.posti=posti;
		else
		throw new IllegalArgumentException("Il numero dei posti non pu� essere negativo");
		
	}
	
	public String getID(){
		return this.ID;
		
	}
	
	public int getPosti(){
		return this.posti;
	}
	
	public Cliente getCliente(){
		
	}
	
}
