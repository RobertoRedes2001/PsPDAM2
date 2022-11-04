package es.florida.tema3;

public class AP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlitasPollo KFC = new AlitasPollo();
		
		Thread hilo1=new Thread(KFC);
		hilo1.start();
		Thread hilo2=new Thread(KFC);
		hilo2.start();
		Thread hilo3=new Thread(KFC);
		hilo3.start();
		Thread hilo4=new Thread(KFC);
		hilo4.start();
		Thread hilo5=new Thread(KFC);
		hilo5.start();
		Thread hilo6=new Thread(KFC);
		hilo6.start();
		Thread hilo7=new Thread(KFC);
		hilo7.start();
		Thread hilo8=new Thread(KFC);
		hilo8.start();
		Thread hilo9=new Thread(KFC);
		hilo9.start();
		Thread hilo10=new Thread(KFC);
		hilo10.start();
		Thread hilo11=new Thread(KFC);
		hilo11.start();
		Thread hilo12=new Thread(KFC);
		hilo12.start();
		Thread hilo13=new Thread(KFC);
		hilo13.start();
		Thread hilo14=new Thread(KFC);
		hilo14.start();
		Thread hilo15=new Thread(KFC);
		hilo15.start();
		Thread hilo16=new Thread(KFC);
		hilo16.start();
		Thread hilo17=new Thread(KFC);
		hilo17.start();
		Thread hilo18=new Thread(KFC);
		hilo18.start();
		Thread hilo19=new Thread(KFC);
		hilo19.start();
		Thread hilo20=new Thread(KFC);
		hilo20.start();
		Thread hilo21=new Thread(KFC);
		hilo21.start();
		Thread hilo22=new Thread(KFC);
		hilo22.start();
		Thread hilo23=new Thread(KFC);
		hilo23.start();
		Thread hilo24=new Thread(KFC);
		hilo24.start();
		Thread hilo25=new Thread(KFC);
		hilo25.start();
		Thread hilo26=new Thread(KFC);
		hilo26.start();
		Thread hilo27=new Thread(KFC);
		hilo27.start();
		Thread hilo28=new Thread(KFC);
		hilo28.start();
		Thread hilo29=new Thread(KFC);
		hilo29.start();
		Thread hilo30=new Thread(KFC);
		hilo30.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Se han comido: "+KFC.getAlitasComidas()+"");
	}

}
