package SumOfNumber;

import java.util.Scanner;

public class SumOfNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int num = sc.nextInt();
		int div = num;
		int sum = 0;
		
		while(div>0) {
			
			int temp = div%10;
			sum = sum + temp;
			div = div/10;
		}
		System.out.println(sum);
		
	}

}
