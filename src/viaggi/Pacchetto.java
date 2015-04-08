package viaggi;

import java.util.Vector;

public class Pacchetto {
	private String ID;
	private String descrizione;
	private int postiTotali;
	private Vector prenotazioni=null;

	public Pacchetto(String ID, String descrizione, int postiTotali){
		if(ID.length()>0)
		this.ID=ID;
		else
			throw new IllegalArgumentException("L'ID non può avere lunghezza 0 (caratteri)");
		
		if(descrizione.length()>0)
		this.descrizione=descrizione;
		else
			throw new IllegalArgumentException("La descrizione non può avere lunghezza 0 (caratteri)");
		
		if(postiTotali>=0)
		this.postiTotali=postiTotali;
		else
			throw new IllegalArgumentException("Il numero dei posti totali non può essere negativo");
	}
	
	public String getID(){
		return this.ID;
	}
	
	public String getDescrizione(){
		return this.descrizione;
	}
	
	public int getPostiTotali(){
		return this.postiTotali;
	}
	
	public int getPostiDisponibili(){
		
	}
	
	public void addPrenotazione(Prenotazione p){
		
	}
	
	public Vector getPrenotazioni(){
		
	}
	
	
}
