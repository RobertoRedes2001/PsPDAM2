package es.florida.tema2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AP6 {

	public static void ejecutar(int n1, int n2){
		
		String clase = "es.florida.tema2.AP3";
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
		String classpath = System.getProperty("java.class.path");
		String className = clase;
		
		List<String> command = new ArrayList<String>();
		
		command.add(javaBin);
		command.add("-cp");
		command.add(classpath);
		command.add(className);
		command.add(String.valueOf(n1));
		command.add(String.valueOf(n2));
		
		ProcessBuilder builder = new ProcessBuilder(command);
		
		try {
			Process p = builder.inheritIO().start();
			p.waitFor();
			FileReader fr = new FileReader("achos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
            		System.out.println(linea);
                    linea = br.readLine();
            }
            br.close();
            br.close();
            fr.close();
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejecutar(3,13);
		ejecutar(7,28);
		
		
	}

}