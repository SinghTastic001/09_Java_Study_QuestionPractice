package ARMSTRONGNUNBER;

import java.util.Scanner;

public class UserInputArrayDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter array lenght");
		
		int length = sc.nextInt();
		
		int[] ar = new int[length];
		System.out.println("enter the number ");
		
		for(int i=0; i<ar.length; i++) {
			
			ar[i] = sc.nextInt();
		}
	}

}
