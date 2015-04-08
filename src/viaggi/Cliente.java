package viaggi;

public class Cliente {
	private String nome;
	private String cognome;
	private String email;
	
	
	public Cliente(String nome, String cognome, String email) {
		if(nome.length()>0)
		this.nome = nome;
		else 
		throw new IllegalArgumentException("Il nome non può avere lunghezza 0 (caratteri)");
		
		if(cognome.length()>0)
		this.cognome = cognome;
		else 
		throw new IllegalArgumentException("Il cognome non può avere lunghezza 0 (caratteri)");
		
		if(email.length()>0)
		this.email = email;
		else 
		throw new IllegalArgumentException("L'email non può avere lunghezza 0 (caratteri)");
	}


	public String getNome() {
		return nome;
	}


	public String getCognome() {
		return cognome;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email="
				+ email + "]";
	}
	
	
}
