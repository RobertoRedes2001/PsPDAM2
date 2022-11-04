package es.florida.tema3;

public class AP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caracol cara1= new Caracol("Paco",100);
		Thread hilo1=new Thread(cara1);
		hilo1.setPriority(3);
		hilo1.start();
//		Caracol cara2= new Caracol("Ahora Soluciones",100);
//		Thread hilo2=new Thread(cara2);
//		hilo2.setPriority(2);
//		hilo2.start();
		Caracol cara3= new Caracol("Mono de Clase",100);
		Thread hilo3=new Thread(cara3);
		hilo3.setPriority(4);
		hilo3.start();
		Caracol cara4= new Caracol("Gary",100);
		Thread hilo4=new Thread(cara4);
		hilo4.setPriority(1);
		hilo4.start();
//		Caracol cara5= new Caracol("Fapencio",100);
//		Thread hilo5=new Thread(cara5);
//		hilo1.setPriority(5);
//		hilo5.start();
	}

}
