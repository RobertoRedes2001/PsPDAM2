package es.florida.tema2;

public class AP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int res=0;
		
		for(int i=num1;i<=num2;i++) {
			res=res+i;
		}
		
		System.out.println(res);
	}

}
