package es.florida.tema1;

public class AP24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroRan = (int)(Math.random()*10+1);
		if(numeroRan==Integer.parseInt(args[0])) {
			System.out.println("NUESTRO CAMPEON");
		}else {
			System.out.println("Prueba suerte otro dia...");
			System.out.println("El numero correcto era: "+numeroRan);
		}
	}

}
