package Matrix;

import java.util.Scanner;

public class MultiplyMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix m1 ");
		
		int[][] m1 = new int[2][2];
		
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
		
		int[][] m2 = new int[2][2];
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
		
		int[][] mul = new int[2][2];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m2.length; j++) {
				mul[i][j] = 0;
				for(int k=0; k<m1.length; k++) {
					mul[i][j] = mul[i][j]+m1[i][k]*m2[k][j];
				}
			}
		}
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1.length; j++) {
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
