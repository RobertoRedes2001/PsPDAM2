package es.florida.tema1;

public class AP25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroRan = (int)(Math.random()*10+1);
		if(numeroRan==Integer.parseInt(args[0])||numeroRan==Integer.parseInt(args[1])||numeroRan==Integer.parseInt(args[2])) {
			System.out.println("NUESTRO CAMPEON");
			System.out.println("El numero correcto: "+numeroRan);
		}else {
			System.out.println("Prueba suerte otro dia...");
			System.out.println("El numero correcto era: "+numeroRan);
		}
	}

}
