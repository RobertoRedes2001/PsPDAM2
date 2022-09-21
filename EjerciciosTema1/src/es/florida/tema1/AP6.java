package es.florida.tema1;

import java.util.Scanner;

public class AP6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		for(int i = 0; i<5; i++) {
			int index = i+1;
			System.out.print("Numero "+index+":");
			num = sc.nextInt();
			sum += num;
		}
		
		System.out.println("Resultado: "+sum);
		
	}

}
