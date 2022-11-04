package es.florida.tema2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MiniProyecto {
	
	public static void ejecutar(double posNEO, double velNEO,String nomNeo){
		String clase = "es.florida.tema2.calcularNEO";
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
		String classpath = System.getProperty("java.class.path");
		String className = clase;
		
		List<String> command = new ArrayList<String>();
		
		command.add(javaBin);
		command.add("-cp");
		command.add(classpath);
		command.add(className);
		command.add(String.valueOf(posNEO));
		command.add(String.valueOf(velNEO));
		command.add(nomNeo);
		
		ProcessBuilder builder = new ProcessBuilder(command);
		try {
			Process p = builder.inheritIO().start();
			p.waitFor();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long inicio = System.currentTimeMillis();
		File NEO = new File("NEO.txt");
		double[] posicionesNEO = new double[12];
		double[] velocidadesNEO = new double[12];
		String[] nombresNEO = new String[12];
		int cont=0;
		try {
			FileReader fr = new FileReader(NEO);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
		    while (linea != null) {
		    	posicionesNEO[cont]=Double.parseDouble(linea.split(",")[1]);
		    	velocidadesNEO[cont]=Double.parseDouble(linea.split(",")[2]);
		    	nombresNEO[cont]=linea.split(",")[0];
		    	cont++;
		        linea = br.readLine();
		    }
		    br.close();
		    fr.close();
		    for (int i = 0; i<posicionesNEO.length;i++) {
		    	 double pos = posicionesNEO[i];
				 double vel = velocidadesNEO[i];
				 String nom = nombresNEO[i];
				 ejecutar(pos,vel,nom);
			}
		    long fin = System.currentTimeMillis();
		    double tiempo = (double) ((fin - inicio)/1000);
		    DecimalFormat frmt = new DecimalFormat();
			frmt.setMaximumFractionDigits(2);
	        System.out.println(frmt.format(tiempo) +" segundos");
	        System.out.println("Tiempo por iteracion: "+frmt.format(tiempo/nombresNEO.length)+" segundos");
		   
		} catch (IOException e) {
			// TODO Auto-generated catch block  AMONGUS
			e.printStackTrace();
		}
	}

}
