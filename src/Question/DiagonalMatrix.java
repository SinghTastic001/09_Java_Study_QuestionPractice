package Question;

import java.util.Scanner;

public class DiagonalMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter matrix 1");
		
		int[][] m1 = new int[3][3];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		
		System.out.println("Enter matrix 2");
		
		int[][] m2 = new int[3][3];
		
		for(int i=0; i<m2.length; i++) {
			for(int j=0; j<m2[i].length; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		
		
		int[][] sum = new int[3][3];
		
		 
			for(int i=0; i<m1.length; i++) {
				for(int j=0; j<m1[i].length; j++) {
					if(m1[i][j]==m2[i][j]) {
						sum[i][j] = m1[i][j]+m2[i][j];
						System.out.print(sum[i][j]+" ");
					}
					
				}
				System.out.println();
			}
			
		
	}

}
