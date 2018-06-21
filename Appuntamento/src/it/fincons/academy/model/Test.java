package it.fincons.academy.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws IOException {
	
	ArrayList<Appuntamento> appuntamentoDaSalvare= new ArrayList<Appuntamento>();
	appuntamentoDaSalvare.add(new Appuntamento(1,"Francesco Gispy","12.30"));
	appuntamentoDaSalvare.add(new Appuntamento(2,"Luciano Volpe","14.30"));
	appuntamentoDaSalvare.add(new Appuntamento(3,"Frenk Russo","15.30"));
	
	//una funzione è chiamata da un oggetto..in questo caso devo creare un ogg della funzione writertxt che stampi il file
	WriterTxt writer = new WriterTxt();
	writer.writeFile("C:/Users/francesco.zingaro/Desktop/academy", appuntamentoDaSalvare);
	}
}
