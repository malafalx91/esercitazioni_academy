package it.fincons.academy.model;

public class Starter {

	public static void main(String[] args) {
		
		//creo un oggetto market con il costruttore di supermercato
		Supermercato market= new Supermercato();
		
		//aggiungo i prodotti alla lista e utilizzo l'enum
		market.aggiungiProdotto(new Alimentari("Granoro",1.10,Tipo.PASTA));
		market.aggiungiProdotto(new Cosmetici("Dior",32.50,Tipo.ROSSETTO));
		market.aggiungiProdotto(new Abbigliamento("nike",10.20,Tipo.MAGLIA));
		market.aggiungiProdotto(new Abbigliamento("adidas",15.20,Tipo.MAGLIA));
		
		//vado a mostrare tutti i prodotti presenti
		//market.elencoProdotti();
		
		//vado a mostrare i prodotti per tipo
		market.elencoProdottiPerTipo(Tipo.MAGLIA);
		
		

	}

}
