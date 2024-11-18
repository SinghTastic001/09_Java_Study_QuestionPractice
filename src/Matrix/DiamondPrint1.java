package Matrix;

import java.util.Scanner;

public class DiamondPrint1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter only odd number ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("u enter even number enter only odd number");
			System.exit(0);
		}
		
		int upper = (num/2)+1;
		int lower = num/2;
		
		for(int i=1; i<=upper; i++) {
			for(int j=1; j<=upper-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=lower; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("a");
			}
			for(int k=1; k<=upper-i; k++) {
				System.out.println("* ");
			}
			System.out.println();
		}
	}
}
