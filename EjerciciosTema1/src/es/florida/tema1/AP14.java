package es.florida.tema1;

import java.util.Scanner;

public class AP14 {

	public static double calcularDiametro(double ratio) {
		double diametro = ratio*2;
		return diametro;
	}
	public static double calcularArea(double ratio) {
		double area = Math.PI*(ratio*2);
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un radio: ");
		double radio = sc.nextDouble();
		double diametro = calcularDiametro(radio);
		double area = calcularArea(radio);
		System.out.println("Radio: "+ String.format("%.3f", radio));
		System.out.println("Diametro: "+ String.format("%.3f", diametro));
		System.out.println("Area: "+ String.format("%.3f", area));
	}

}
