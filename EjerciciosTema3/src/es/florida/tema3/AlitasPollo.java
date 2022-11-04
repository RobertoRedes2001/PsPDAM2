package es.florida.tema3;

public class AlitasPollo implements Runnable{
	
	private int alitaPollo = 100;
	private int alitasComidas = 0;
	

	public int getAlitasComidas() {
		return alitasComidas;
	}

	public int getAlitaPollo() {
		return alitaPollo;
	}

	synchronized public void consumirAlita() {
		
		int alitaComida = (int) (Math.random()*10+1);
		if(alitaComida>alitaPollo) {
			alitaComida=alitaPollo;
		}
		if(alitaPollo<=0) {
			System.out.println("No comes.");
		}else {
			
			System.out.println("Te comes "+alitaComida+" alitas.");
			alitaPollo=alitaPollo-alitaComida;
			alitasComidas=alitasComidas+alitaComida;
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		consumirAlita();
		
	}
	
	
}
