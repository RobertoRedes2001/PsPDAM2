package es.florida.tema1;

import java.util.Scanner;

public class AP36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[5];
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		
		for(int i=nums.length-1;i>=0;i--) {
			System.out.println(nums[i]);
			suma+=nums[i];
		}
		System.out.println(suma);
	}

}
