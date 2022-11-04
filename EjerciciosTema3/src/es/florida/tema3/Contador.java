package es.florida.tema3;

public class Contador implements Runnable{
	
	private String nombreHilo;
	private int inicioContador;
	private int limiteContador;
	
	public Contador(String nom, int inicio, int fin) {
		this.nombreHilo=nom;
		this.inicioContador=inicio;
		this.limiteContador=fin;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.nombreHilo+" a comenzado.");
		System.out.println("La cuenta empieza en:"+inicioContador);
		try {
			Thread.sleep(limiteContador-inicioContador);
			System.out.println("La cuenta a finalizado. "+this.nombreHilo+" llega a su fin.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
