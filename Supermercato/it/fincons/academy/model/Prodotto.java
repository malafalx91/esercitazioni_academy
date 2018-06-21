package it.fincons.academy.model;

public class Prodotto {
	
	private String nome;
	private double prezzo;
	private Tipo tipo;
	public Prodotto(String nome, double prezzo, Tipo tipo) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	 

}
