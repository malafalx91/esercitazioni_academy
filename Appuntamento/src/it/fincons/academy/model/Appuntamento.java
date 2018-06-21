package it.fincons.academy.model;

public class Appuntamento {
	private int id;
	private String Nome;
	private String orario;
	public Appuntamento(int id, String nome, String orario) {
		super();
		this.id = id;
		Nome = nome;
		this.orario = orario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getOrario() {
		return orario;
	}
	public void setOrario(String orario) {
		this.orario = orario;
	}
	
	

}
