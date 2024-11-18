package ARMSTRONGNUNBER;

import java.util.Scanner;

public class DiagonalMatrixDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] ar = new int[3][3];
		System.out.println("Enter m1 number");
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++ ) {
				ar[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] m2 = new int[3][3];
		
		for(int i=0; i<m2.length; i++) {
			for(int j=0; j<m2[i].length; j++) {
				
				m2[i][j] = sc.nextInt();
			
			}
		}
		
		for(int i=0; i<m2.length; i++) {
			for(int j=0; j<m2[i].length; j++) {
				System.out.println(m2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
