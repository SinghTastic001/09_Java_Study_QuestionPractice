package CountNumbe;

import java.util.Scanner;

public class CountNumberR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		
		do {
			temp = temp/10;
			count++;
		}while(temp>0);
		
		System.out.println(count);
	}
}
