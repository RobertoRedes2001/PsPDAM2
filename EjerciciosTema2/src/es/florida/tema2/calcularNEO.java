package es.florida.tema2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class calcularNEO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double posicionNEO = Float.parseFloat(args[0]);
		double velocidadNEO = Float.parseFloat(args[1]);
		String name = args[2];
		double posicionTierra = 1;
		double velocidadTierra = 100;
		for (int i = 0; i < (50 * 365 * 24 * 60 * 60); i++) {
		posicionNEO = posicionNEO + velocidadNEO * i;
		posicionTierra = posicionTierra + velocidadTierra * i;
		}
		Double resultado = 100 * Math.random() *
		Math.pow( ((posicionNEO-posicionTierra)/(posicionNEO+posicionTierra)), 2);
		File arx = new File("C:\\Users\\dam2\\Documents\\PsP\\EjerciciosTema2\\cont\\"+name+".txt");
		DecimalFormat frmt = new DecimalFormat();
		frmt.setMaximumFractionDigits(2);
		if(resultado>50) {
			System.out.printf(name+": "+frmt.format(resultado)+"\nALERTA: VAMOSA  MORIR!!!!");
		}else {
			System.out.println(name+": "+frmt.format(resultado)+"\nALERTA: Estamos joya.");
		}
		try {
			FileWriter fw = new FileWriter(arx);
			fw.write(resultado+"");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
