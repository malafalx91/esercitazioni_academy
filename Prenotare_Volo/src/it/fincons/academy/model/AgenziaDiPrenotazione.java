package it.fincons.academy.model;

public class AgenziaDiPrenotazione extends Thread {
	
	int idAgenzia;
	String Nome;
	Volo volo;//oggetto di volo
	public AgenziaDiPrenotazione(int idAgenzia, String nome, Volo volo) {
		super();
		this.idAgenzia = idAgenzia;
		Nome = nome;
		this.volo = volo;
	}
	public int getIdAgenzia() {
		return idAgenzia;
	}
	public void setIdAgenzia(int idAgenzia) {
		this.idAgenzia = idAgenzia;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Volo getVolo() {
		return volo;
	}
	public void setVolo(Volo volo) {
		this.volo = volo;
	}
	
	public void run() {
		while(volo.getPostiDisponibili() >0) {
			volo.prenotaVolo(idAgenzia);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		}
	

}
