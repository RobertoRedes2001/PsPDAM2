package es.florida.tema1;

import java.util.Scanner;

public class AP21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] nombres = new String[5];
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = sc.next();
		}
		System.out.println("Nombres: ");
		for (int i = 0; i < nombres.length; i++) {
			System.out.print(nombres[i] + " ");
		}
		
	}

}
