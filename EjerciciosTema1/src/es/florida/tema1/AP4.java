package es.florida.tema1;

import java.util.Scanner;

public class AP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero 1:");
		int num1 = sc.nextInt();
		System.out.print("Numero 2:");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("Mayor: "+num1);
			System.out.println("Menor: "+num2);
		}else {
			System.out.println("Mayor: "+num2);
			System.out.println("Menor: "+num1);
		}
			
			
	}

}
