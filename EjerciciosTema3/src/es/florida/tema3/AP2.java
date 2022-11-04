package es.florida.tema3;

public class AP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador cont1= new Contador("Enero, el primero",5,2000);
		Thread hilo1=new Thread(cont1);
		hilo1.start();
		Contador cont2= new Contador("Febrero, el segundo",12,45);
		Thread hilo2=new Thread(cont2);
		hilo2.start();
		Contador cont3= new Contador("Marzo, el tercero",200,2200);
		Thread hilo3=new Thread(cont3);
		hilo3.start();
		Contador cont4= new Contador("Abril, el cuarto",0,500);
		Thread hilo4=new Thread(cont4);
		hilo4.start();
		Contador cont5= new Contador("Jesucristo, el quinto",52,3200);
		Thread hilo5=new Thread(cont5);
		hilo5.start();
	}

}
