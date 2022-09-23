package es.florida.tema1;

import java.util.Scanner;

public class AP12 {
	
	public static void MostrarNotas(int[] arrayNum) {
		for(int i=0;i<arrayNum.length;i++) {
			if(arrayNum[i]!=0)
			System.out.print(arrayNum[i]);
			System.out.print(" ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] notas = new int[10];
		int[] suspensos = new int[10];
		int[] aprobados = new int[10];
		int[] notables = new int[10];
		int[] sobresalientes = new int[10];

		for (int i = 0; i < notas.length; i++) {
			int anum = i+1;
			System.out.print("A�ada la nota de alumno"+"#"+anum+": ");
			notas[i] = sc.nextInt();
		}
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 9) {
				sobresalientes[i] = notas[i];
			}else if (notas[i] >= 7 ) {
				notables[i] = notas[i];
			}else if (notas[i] >= 5 ) {
				aprobados[i] = notas[i];
			}else{
				suspensos[i] = notas[i];
			}
		}
		
		
		System.out.println("Suspendidos: ");
		MostrarNotas(suspensos);
		System.out.println("Aprobados: ");
		MostrarNotas(aprobados);
		System.out.println("Notables: ");
		MostrarNotas(notables);
		System.out.println("Sobresalientes: ");
		MostrarNotas(sobresalientes);

	}

}
