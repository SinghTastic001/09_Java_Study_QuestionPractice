package Question;

import java.util.Scanner;

public class starprint1 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no. of printing star");
		
		int row = sc.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
