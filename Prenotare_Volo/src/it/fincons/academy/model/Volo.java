package it.fincons.academy.model;

public class Volo {
	
	private int idVolo;
	private int postiDisponibili;
	private String partenza;
	private String arrivo;
	
	public Volo(int idVolo, int postiDisponibili, String partenza, String arrivo) {
		super();
		this.idVolo = idVolo;
		this.postiDisponibili = postiDisponibili;
		this.partenza = partenza;
		this.arrivo = arrivo;
	}
	public int getId() {
		return idVolo;
	}
	public void setId(int idVolo) {
		this.idVolo = idVolo;
	}
	public int getPostiDisponibili() {
		return postiDisponibili;
	}
	public void setPostiDisponibili(int postiDisponibili) {
		this.postiDisponibili = postiDisponibili;
	}
	public String getPartenza() {
		return partenza;
	}
	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}
	public String getArrivo() {
		return arrivo;
	}
	public void setArrivo(String arrivo) {
		this.arrivo = arrivo;
	}
	
	synchronized void prenotaVolo(int idAgenzia) {
		if(postiDisponibili > 0) {
			postiDisponibili--;
			System.out.println("Prenotazione effettuata dall'agenzia: "+ idAgenzia +", N. posti " + postiDisponibili);
		}
	}

}
