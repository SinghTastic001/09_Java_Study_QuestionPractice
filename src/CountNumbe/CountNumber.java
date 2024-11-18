package CountNumbe;

import java.util.Scanner;

public class CountNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
//		int num = 123456;
		int temp = num;
		
		int count = 0;
		
		while(temp>0) {
			
			
			count++;
			temp = temp/10;
		}
		System.out.println(count);
		
	}

}

// this is invalid type
