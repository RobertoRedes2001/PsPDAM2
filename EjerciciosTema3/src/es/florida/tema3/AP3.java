package es.florida.tema3;

public class AP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caracol cara1= new Caracol("Paco",5);
		Thread hilo1=new Thread(cara1);
		hilo1.start();
		Caracol cara2= new Caracol("Ahora Soluciones",7);
		Thread hilo2=new Thread(cara2);
		hilo2.start();
		Caracol cara3= new Caracol("Mono de Clase",13);
		Thread hilo3=new Thread(cara3);
		hilo3.start();
		Caracol cara4= new Caracol("Gary",11);
		Thread hilo4=new Thread(cara4);
		hilo4.start();
		Caracol cara5= new Caracol("Fapencio",1);
		Thread hilo5=new Thread(cara5);
		hilo5.start();
	}

}
