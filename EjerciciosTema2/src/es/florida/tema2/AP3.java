package es.florida.tema2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AP3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int res=0;
		
		for(int i=num1;i<=num2;i++) {
			res=res+i;
		}
		
		File arx = new File("achos.txt");
		
		try {
			FileWriter fw = new FileWriter(arx);
			fw.write(res+"");
			fw.close();
			System.out.println(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
