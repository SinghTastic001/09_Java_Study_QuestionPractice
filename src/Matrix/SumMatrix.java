package Matrix;

import java.util.Scanner;

public class SumMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a m1 number ");
		
		int[][] m1 = new int[3][3];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1.length; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1.length; j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter a matrix m2");
		int[][] m2 = new int[3][3];
		
		for(int i=0; i<m2.length; i++) {
			for(int j=0; j<m2.length; j++) {
				m2[i][j] = sc.nextInt();
			}
			
		}
		
		for(int i=0; i<m2.length; i++) {
			for(int j=0; j<m2.length; j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] sum = new int[3][3];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1.length; j++) {
				sum[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		for(int i=0; i<sum.length; i++) {
			for(int j=0; j<sum.length; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}

}
