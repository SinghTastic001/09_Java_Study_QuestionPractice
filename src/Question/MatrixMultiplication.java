package Question;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter matrix 1");
		
		int[][] m1 = new int[2][2];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		
		System.out.println("Enter matrix 2");
		
		int[][] m2 = new int[2][2];
		
		for(int i=0; i<m2.length; i++) {
			for(int j=0; j<m2[i].length; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		int[][] mul = new int[2][2];
		
		for(int i =0; i<m1.length; i++) {
			for(int j=0; j<m1.length; j++) {
				mul[i][j]=0;
				for(int k=0; k<m1.length; k++) {
					mul[i][j]= mul[i][j]+m1[i][k]*m2[k][j];
				}
			}
		}
		
		System.out.println();
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
	}
}
