package SumOfNumber;

import java.util.Scanner;

public class SumNumber {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		
		while(temp>0) {
			
			int r = temp%10;
			sum = sum + r;
			temp = temp/10;
		}
		
		System.out.println(sum);
		
	}

}
