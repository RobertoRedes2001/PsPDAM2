package es.florida.tema1;

import java.util.ArrayList;
import java.util.Scanner;

public class AP38 {

	public static boolean esPrimo(int num) {

		if (num == 0 || num == 1 || num == 4) {
			return false;
		}

		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero de inicio y uno de fin: ");
		ArrayList<Integer> primos = new ArrayList<Integer>();
		ArrayList<Integer> noPrimos = new ArrayList<Integer>();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for(int i=n1;i<=n2;i++) {
			if(esPrimo(i)) {
				primos.add(i);
			}else {
				noPrimos.add(i);
			}
		}
		
		System.out.println("Numeros Primos: ");
		for(int i=0;i<primos.size();i++) {
			System.out.print(primos.get(i)+" ");
		}
		System.out.println("");
		System.out.println("Numeros NO Primos: ");
		for(int i=0;i<noPrimos.size();i++) {
			System.out.print(noPrimos.get(i)+" ");
		}
	}

}
