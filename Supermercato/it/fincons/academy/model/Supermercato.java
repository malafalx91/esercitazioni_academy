package it.fincons.academy.model;

import java.util.ArrayList;
import java.util.List;


public class Supermercato {
	//creazione della lista
	List<Prodotto>listaProdotti = new ArrayList<Prodotto>();
	
	public void aggiungiProdotto(Prodotto x) {
		listaProdotti.add(x); //seleziono la lista e inserisco
	}
	public void elencoProdotti() {
		for(Prodotto x:listaProdotti) {
			System.out.println(x.getNome() + " " + x.getPrezzo() + " "+ x.getTipo());
		
		}
	}

    public void elencoProdottiPerTipo(Tipo t) {
    	for(Prodotto x:listaProdotti) {
    		if(t==x.getTipo())
    		System.out.println(x.getNome() + " " + x.getPrezzo() + " "+ x.getTipo());
    	}
    }
}
