package ReverseNumber3W;

import java.util.Scanner;

public class SecondWay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number "); //12345
		int num = sc.nextInt();
		
//		int rev = 0;
//		
//		while(num!=0) {
//			rev = rev*10 + num%10;
//			num = num/10;
//		}
//		System.out.println(rev);
		
		
		StringBuffer rev ;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev = sb.reverse();
		System.out.println(rev);
	}
}
