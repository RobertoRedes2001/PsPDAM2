package es.florida.tema1;

import java.util.Scanner;

public class AP13 {
	public static double convertirFarenheit(double centigrados) {
		double Far = (centigrados * 9 / 5) + 32;
		return Far;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime unos grados centigrados: ");
		double grados = sc.nextDouble();
		double gradosF = convertirFarenheit(grados);
		System.out.println("Grados Centigrados: "+ String.format("%.1f", grados));
		System.out.println("Grados Fahrenheit: "+ String.format("%.1f", gradosF));
	}

}
