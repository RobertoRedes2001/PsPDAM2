package es.florida.tema3;

public class Caracol implements Runnable{
	
	private String nombreCaracol;
	private double velocidadCaracol;

	public Caracol(String nom, double vel) {
		this.nombreCaracol=nom;
		this.velocidadCaracol=vel;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		double metro = 1000;
		double recorrido = 0;
		int porcentaje = 0;
		System.out.println("Comienza la carrera!");
		System.out.println(recorrido);
		while(recorrido<=metro) {
			recorrido+=this.velocidadCaracol;
			porcentaje=(int) ((recorrido/metro)*100);
			if(porcentaje>100) {
				porcentaje=100;
			}
			System.out.println(this.nombreCaracol+" lleva recorrido el "+porcentaje+"%");
		}
		System.out.println(this.nombreCaracol+" a acabado la carrera!");
	}
}
