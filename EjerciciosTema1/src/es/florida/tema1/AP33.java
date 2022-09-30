package es.florida.tema1;

public class AP33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma=0;
		for(int i = 0;i<=Integer.parseInt(args[0]);i++) {
			if(i%2==0) {
				suma+=i;
			}
		}
		System.out.println(suma);
	}

}
