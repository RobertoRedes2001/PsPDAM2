package es.florida.tema1;

public class AP35 {
	
	public static int esMayor(int[] numeros) {
		int mayor=0;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>mayor) {
				mayor=numeros[i];
			}
		}
		
		return mayor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,5,9,4,3,0,4,6};
		int elMayor = esMayor(nums);
		System.out.println(elMayor);
	}

}
