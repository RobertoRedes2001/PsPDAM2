package es.florida.tema1;

import java.util.ArrayList;
import java.util.Scanner;

public class AP22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nombres = new ArrayList<String>();
		int index = 0;
		do {
			nombres.add(sc.next());
			index++;
		} while (!nombres.get(index - 1).equals("0"));
		System.out.println("Nombres: ");
		for (int i = 0; i < nombres.size(); i++) {
			if (!nombres.get(i).equals("0")) {
				System.out.print(nombres.get(i) + " ");
			}
		}
	}

}
