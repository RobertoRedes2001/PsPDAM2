package es.florida.tema1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ap29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		int index = 1;
		String answer;
		do {
			System.out.println("VEHICULO #"+index);
			System.out.println("==================");
			System.out.println("Marca: ");
			String marca = sc.next();
			System.out.println("Tipo: ");
			String tipo = sc.next();
			System.out.println("Modelo: ");
			String modelo = sc.next();
			Vehiculo vehi = new Vehiculo(tipo,marca,modelo);
			vehiculos.add(vehi);
			System.out.print("┐Continuar?: ");
			answer = sc.next();
			if(answer.equals("y")) {
				cont=true;
			}else {
				cont=false;
			}
			index++;
		} while (cont);
		System.out.println("VEHICULOS: ");
		for (int i = 0; i < vehiculos.size(); i++) {
			System.out.println("#"+i);
			vehiculos.get(i).mostrarVehiculo();
		}
	}

}
