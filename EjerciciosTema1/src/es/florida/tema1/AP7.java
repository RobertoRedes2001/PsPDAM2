package es.florida.tema1;

import java.util.Scanner;

public class AP7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		int i=0;
		
		do {
			int index = i+1;
			System.out.print("Numero "+index+":");
			num = sc.nextInt();
			sum += num;
			i++;
		}while(i<5);
		
		System.out.println("Resultado: "+sum);
	}

}
