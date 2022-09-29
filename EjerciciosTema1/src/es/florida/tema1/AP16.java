package es.florida.tema1;

import java.util.Scanner;

public class AP16 {

	public static String[] separarNum(int num) {
        String txNum = String.valueOf(num);
        return txNum.split("");
    }

	public static int calcularNum(int num) {
		
		int otroNum = 0;
		String[] arrayNum = separarNum(num);
		for(int i=0;i<arrayNum.length;i++){
			otroNum += Integer.parseInt(arrayNum[i]);
		}

		return otroNum;
	}

	public static int calcularLN(int n1, int n2, int n3){
		
		n1 = calcularNum(n1);
		n2 = calcularNum(n2);
		n3 = calcularNum(n3);
		n3 = calcularNum(n3);
		int luckyNum = n1+n2+n3;
		luckyNum = calcularNum(luckyNum);

		return luckyNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime tu dia de nacimiento: ");
		int dia = sc.nextInt();
		System.out.print("Dime tu mes de nacimiento: ");
		int mes = sc.nextInt();
		System.out.print("Dime tu anyo de nacimiento: ");
		int any = sc.nextInt();
		int luckyNumber=calcularLN(dia, mes, any);
		System.out.println("Tu numero de la suerte es: "+luckyNumber);
	}

}

