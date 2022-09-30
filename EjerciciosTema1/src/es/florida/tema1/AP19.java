package es.florida.tema1;

public class AP19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] caracter = {'a','b','-','2'};
		int[] codigoCaracter = new int[caracter.length];
		System.out.println("Caracter - Codigo");
		System.out.println("=================");
		for(int i=0;i<caracter.length;i++) {
			codigoCaracter[i] = caracter[i];
			System.out.print(caracter[i]);
			System.out.print(" - ");
			System.out.print(codigoCaracter[i]);
			System.out.println("");
		}
		
		//este ejercicio engloba el 19 y el 20
	}

}
