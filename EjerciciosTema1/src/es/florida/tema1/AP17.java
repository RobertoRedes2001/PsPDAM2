package es.florida.tema1;

import java.util.Scanner;

public class AP17 {

	public static char[] separateWord(String word) {
        char[] arrayChar = word.toCharArray();
        return arrayChar;
    }
	
	public static void esValida(String pass) {
		char[] arrayPass = separateWord(pass);
		int carCont = 0;
		int mayusCont = 0;
		int numCont = 0;
		for(int i=0; i<arrayPass.length;i++) {
			if(Character.isDigit(arrayPass[i])) {
				numCont++;
			}
			if(Character.isUpperCase(arrayPass[i])) {
				mayusCont++;
			}
			carCont++;
		}
		
		if(carCont>=5&&mayusCont>=1&&numCont>=1) {
			System.out.println("Contraseña valida.");
		}else {
			System.out.println("Contraseña no valida.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba su contraseña: ");
		String password = sc.next();
		esValida(password);
		
	}

}
