package es.florida.tema1;

import java.util.Scanner;

public class AP37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nombre: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Antigüedad: ");
		String nom = sc.next();
		int antiguedad = sc.nextInt();
		
		if(antiguedad>=8) {
			System.out.println("Analista / Arquitecto. Salario a convenir en base a rol");
		}else if(antiguedad<8&&antiguedad>=5) {
			System.out.println("Desarrollador Senior L2 – 28000-36000");
		}else if(antiguedad<5&&antiguedad>=3) {
			System.out.println("Desarrollador Senior L1 – 22000-28000");
		}else if(antiguedad==0) {
			System.out.println("Desarrollador Junior L1 – 15000-18000");
		}else {
			System.out.println("Desarrollador Junior L2 – 18000-22000");
		}
	}

}
