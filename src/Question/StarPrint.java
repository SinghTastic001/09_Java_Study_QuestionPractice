package Question;

import java.util.Scanner;

public class StarPrint {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number for printing star");
		
		int len = sc.nextInt();
		
		for(int i=0; i<len; i++) {
			
			for(int j=0; j<i+1; j++) {
				
				System.out.print("*"+" ");
				
			}
			System.out.println();
			
		}
	}

}
