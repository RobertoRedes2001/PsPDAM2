package es.florida.tema3;

public class MostrarASCII implements Runnable {

	private int tipo;
	
	public MostrarASCII(int tipo) {
		this.tipo=tipo;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(this.tipo==2) {
			for(char car = 'a';car<='z';car++) {
				if(car%2==0) {
					System.out.print("P:"+car+" ");
				}
			}
		}
		if(this.tipo==1) {
			for(char car = 'a';car<='z';car++) {
				if(car%2!=0) {
					System.out.print("I:"+car+" ");
				}
			}
		}
	}
	

}
