package es.florida.tema1;

import java.util.Scanner;

public class AP11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe tu DNI: ");
		int DNI = sc.nextInt();
		int letraPos = DNI%23;
		char tabla[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		System.out.println("Tu DNI es: "+DNI+tabla[letraPos]);
	}

}
