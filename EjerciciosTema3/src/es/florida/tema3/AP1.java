package es.florida.tema3;

public class AP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MostrarASCII asc1= new MostrarASCII(1);
		Thread hilo1=new Thread(asc1);
		hilo1.start();
		MostrarASCII asc2= new MostrarASCII(2);
		Thread hilo2=new Thread(asc2);
		hilo2.start();
		}
	}
