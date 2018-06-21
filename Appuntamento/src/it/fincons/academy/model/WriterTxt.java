package it.fincons.academy.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class WriterTxt implements Writer {

	@Override
	public void writeFile(String pathFile, ArrayList<Appuntamento> appuntamentoDaSalvare) throws IOException {
		

		for(Appuntamento x:appuntamentoDaSalvare) {

			File file = new File(pathFile+"/javatestStampa.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Appuntamento numero:"+x.getId() +"con il cliente"+x.getNome()+"alle ore"+x.getOrario() );
			bw.flush();
			bw.close();




			byte[] buffer = new byte[1024];

			try{

				FileOutputStream fos = new FileOutputStream(pathFile+"/javatestStampa.zip");
				ZipOutputStream zos = new ZipOutputStream(fos);
				ZipEntry ze= new ZipEntry("spy.log");
				zos.putNextEntry(ze);
				FileInputStream in = new FileInputStream(pathFile+"/javatestStampa.txt");

				int len;
				while ((len = in.read(buffer)) > 0) {
					zos.write(buffer, 0, len);
				}

				in.close();
				zos.closeEntry();

				//remember close it
				zos.close();

				System.out.println("Done");

			}catch(IOException ex){
				ex.printStackTrace();
			}

		}
	}


}
