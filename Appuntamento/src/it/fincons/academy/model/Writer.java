package it.fincons.academy.model;

import java.io.IOException;
import java.util.ArrayList;

public interface Writer {
	public void writeFile(String pathFile, ArrayList<Appuntamento>appuntamentoDaSalvare) throws IOException;

}
