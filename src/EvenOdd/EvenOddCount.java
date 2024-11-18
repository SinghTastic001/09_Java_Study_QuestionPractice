package EvenOdd;

import java.util.Scanner;

public class EvenOddCount {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int oddcount = 0;
		int evencount = 0;
		int div = num;
		
		
		while(div>0) {
			
			int temp = div%10;
			if(temp%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
			
			div = div/10;
		}
		System.out.println(evencount);
		System.out.println(oddcount);
		
	}

}
