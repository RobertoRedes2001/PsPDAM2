package es.florida.tema1;

import java.util.ArrayList;

public class AP32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrayNombres = new String[] {"Carlos","Pepe","Alejandro", "Carmen Electra","Victor","Vector"};
		System.out.println("ARRAY:");
		for(int i=0;i<arrayNombres.length;i++) {
			System.out.println(arrayNombres[i]);
		}
	
		ArrayList<String> listaNombres = new ArrayList<String> ();
		listaNombres.add("Carlos");
		listaNombres.add("Pepe");
		listaNombres.add("Alejandro");
		listaNombres.add("Carmen Electra");
		listaNombres.add("Victor");
		listaNombres.add("Vector");
		System.out.println("LISTA:");
		for(int i=0;i<listaNombres.size();i++) {
			System.out.println(listaNombres.get(i));
		}
	}

}
