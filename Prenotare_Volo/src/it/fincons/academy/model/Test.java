package it.fincons.academy.model;

public class Test {

	public static void main(String[] args) {
		/*Airline ai=new Airline();
		ai.start();  main altro esercizio*/
		Volo volo= new Volo(1, 20, "Bari", "Torino");
		AgenziaDiPrenotazione agenzia=new AgenziaDiPrenotazione(1, "Alpitur", volo);
		agenzia.start();
		
		AgenziaDiPrenotazione agenzia1=new AgenziaDiPrenotazione(2, "Vegas", volo);
		agenzia1.start();
		
		AgenziaDiPrenotazione agenzia2=new AgenziaDiPrenotazione(3, "Sogni", volo);
		agenzia2.start();

	}

}
