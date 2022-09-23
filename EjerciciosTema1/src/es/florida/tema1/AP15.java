package es.florida.tema1;

import java.util.Scanner;

public class AP15 {

	public static double calcularDiametro(double ratio) {
		double diametro = ratio*2;
		return diametro;
	}
	public static double calcularArea(double ratio) {
		double area = Math.PI*(ratio*2);
		return area;
	}
	
	public static double calcularEsfera(double ratio) {
		double esfera = (4/3)*Math.PI*Math.pow(ratio, 3);
		return esfera;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un radio: ");
		double radio = sc.nextDouble();
		double diametro = calcularDiametro(radio);
		double area = calcularArea(radio);
		double esfera = calcularEsfera(radio);
		System.out.println("Radio: "+ String.format("%.3f", radio));
		System.out.println("Diametro: "+ String.format("%.3f", diametro));
		System.out.println("Area: "+ String.format("%.3f", area));
		System.out.println("Volumen esfera: "+ String.format("%.3f", esfera));
	}

}
